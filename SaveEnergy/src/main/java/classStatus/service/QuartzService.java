package classStatus.service;

import java.util.List;

import classStatus.pojo.JobEntity;

public interface QuartzService {
	/**
	 * addJob(添加一个定时任务)
	 * @param jobName
	 * 		作业名称
	 * @param jobGroupName
	 * 		作业组名称
	 * @param triggerName
	 * 		触发器名称
	 * @param triggerGroupName
	 * 		触发器组名称
	 * @param cls
	 * 		定时任务的class
	 * @param simple
	 * 
	 * @param startTime 
	 * 		任务开始时间
	 */				
	public void addJob(String jobName,String jobGroupName,String triggerName,String triggerGroupName,Class cls,String cronExpr);
	
	public List<JobEntity> queryAllJob();
	
	public void modifyJobTime(String oldjobName, String oldjobGroup, String oldtriggerName, String oldtriggerGroup, String jobName, String jobGroup,
			String triggerName, String triggerGroup, String cron);
	
	void removeJob(String jobName, String jobGroupName,String triggerName, String triggerGroupName);
}
