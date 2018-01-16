package classStatus.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import classStatus.pojo.JobEntity;
import classStatus.service.impl.QuartzServiceImpl;

@Controller
@RequestMapping(value="/quartz")
public class QuartzAction {
	@Autowired
	private QuartzServiceImpl quartzServiceImpl;
	
	@RequestMapping(value="/add.do")
	public void addJob(HttpServletResponse response ,HttpServletRequest request ) throws ClassNotFoundException {
		String jobName=request.getParameter("jobName");
		String jobGroupName=request.getParameter("jobGroupName");
		String triggerName= request.getParameter("triggerName");
		String triggerGroupName=request.getParameter("triggerGroupName");
		String className=request.getParameter("cls");
		String cronExpr=request.getParameter("cronExpr");//cron表达式
		StringBuffer sb=new StringBuffer();
		String cron="* 30 7 ? * MON-FRI";
		sb.append("classStatus.job.");
		sb.append(className);
		Class cls=Class.forName("classStatus.job.OpenJob");
		quartzServiceImpl.addJob(jobName, jobGroupName, triggerName, triggerGroupName, cls,cronExpr);	
		
	}
	
	@ResponseBody
	@RequestMapping(value="/query.do")
	public String  queryAllJob() {
		List<JobEntity> jobList=quartzServiceImpl.queryAllJob();
		Gson gson=new Gson();
		String jobStr=gson.toJson(jobList);
		return jobStr;
	}
}
