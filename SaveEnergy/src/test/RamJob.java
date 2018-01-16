import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class RamJob implements Job{

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		//任务要执行 的内容
		System.out.println("Hello to quertz"+"  "+new Date());
		
	}

}
