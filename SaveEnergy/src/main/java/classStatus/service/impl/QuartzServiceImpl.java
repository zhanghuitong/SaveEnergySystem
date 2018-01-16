package classStatus.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import classStatus.pojo.JobEntity;
import classStatus.service.QuartzService;
import classStatus.util.DateTransform;
@Service
public class QuartzServiceImpl implements QuartzService {

	@Autowired
	private Scheduler quartzScheduler;

	@Override
	public void addJob(String jobName, String jobGroupName, String triggerName, String triggerGroupName, Class cls,String cronExpr) {
		// 获取调度器
		Scheduler sche = quartzScheduler;
		// 创建作业
		JobDetail job = JobBuilder.newJob(cls).withIdentity(jobName, jobGroupName).build();
		System.out.println("Cls  "+cls);
		System.out.println("cronExpr   "+cronExpr);
		// 创建有给cronTrigger类型的触发器
		CronTrigger trigger = TriggerBuilder.newTrigger()
				.withIdentity(triggerName, triggerGroupName)
				.withSchedule(CronScheduleBuilder.cronSchedule(cronExpr))
				.build();

		// 告诉调度器由该触发器来安排作业
		try {
			System.out.println("开始任务");
			sche.scheduleJob(job, trigger);
			// 启动调度器
			if (!sche.isShutdown()) { 
				sche.start();
			}
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 查询所有作业 
	 * 返回 所有Job的json数据
	 */
	@Override
	public List<JobEntity> queryAllJob() {
		List<JobEntity> jobList = new ArrayList<JobEntity>();
		try {
			for (String groupName : quartzScheduler.getJobGroupNames()) {
				for (JobKey jobKey : quartzScheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
					String jobName = jobKey.getName();
					String jobGroup = jobKey.getGroup();

					// 获取作业的触发器,可能有多个触发器
					List<Trigger> triggers = (List<Trigger>) quartzScheduler.getTriggersOfJob(jobKey);
					//依次获得触发器的触发时间
					for(Trigger trigger:triggers) {
						Date nextFireTime = trigger.getNextFireTime();// 下一次触发的时间
						String nextTime = DateTransform.trans(nextFireTime);
						JobEntity job = new JobEntity();
						job.setJobName(jobName);
						job.setJobGroup(jobGroup);
						job.setNextFireTime(nextTime);
						jobList.add(job);
					}
				}
			}
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jobList;
	}

	@Override
	public void modifyJobTime(String oldjobName, String oldjobGroup, String oldtriggerName, String oldtriggerGroup,
			String jobName, String jobGroup, String triggerName, String triggerGroup, String cron) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeJob(String jobName, String jobGroupName, String triggerName, String triggerGroupName) {
		try {
			Scheduler sched = quartzScheduler;
			// 停止触发器
			sched.pauseTrigger(TriggerKey.triggerKey(triggerName,
					triggerGroupName));
			// 移除触发器
			sched.unscheduleJob(TriggerKey.triggerKey(triggerName,
					triggerGroupName));
			// 删除任务
			sched.deleteJob(JobKey.jobKey(jobName, jobGroupName));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}
