import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCJob implements Job{
	private Logger log=LoggerFactory.getLogger(Job.class);

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		log.info("Hello JdbcJob start"+new SimpleDateFormat("yyyy-MM-ss").format(new Date()));
		System.out.println("hello ");
	}
}
