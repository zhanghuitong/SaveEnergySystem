import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzTest {
	
	/**
	 * RAMJob作业调度demo
	 * @param args
	 * @throws SchedulerException
	 * @throws ParseException
	 */
	public static void main(String[] args) throws SchedulerException, ParseException {
		//1.创建schedule工厂
		SchedulerFactory sf=new StdSchedulerFactory();
		//2.从工厂中获取调度器实例
		Scheduler scheduler=sf.getScheduler();
		
		//3.创建jobDetail
		JobDetail jb1=JobBuilder.newJob(RamJob.class)
				.withDescription("tS")//job的描述
				.withIdentity("job","job2")//job名字和job的组
				.build();//建立这个job
		
		JobDetail jb=JobBuilder.newJob(RamJob.class)
				.withDescription("tS")//job的描述
				.withIdentity("job1","job2")//job名字和job的组
				.build();//建立这个job
		 
		//设置任务运行的时间,SimpleSchedle类型触发器有效
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date startTime=sdf.parse("2017-10-27 00:15:00");
		Date startTime2=sdf.parse("2017-10-27 00:16:30");
		
		
		//4.创建trigger
			//使用SimpleScheduleBuilder或者CronScheduleBuilder
		Trigger t=TriggerBuilder.newTrigger()//新建一个触发器对象
				.withDescription("")//触发器的描述
				.withIdentity("ramTrigger","ramTriggerGroup")//触发器的名称和触发器的组
				.startAt(startTime)//设置任务开始的时间,默认是系统当前的时间
				.withSchedule(SimpleScheduleBuilder.simpleSchedule())//设置使用哪种定时器
				.build();
		
		Trigger t2=TriggerBuilder.newTrigger()
				.withIdentity("trigger2","triggerGroup")
				.startAt(startTime2)
				.build();
		//5.注册任务和定时器
		scheduler.scheduleJob(jb1, t);
		scheduler.scheduleJob(jb,t2);
		//6.开始作业
		scheduler.start();
			
	}
}
