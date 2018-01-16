package classStatus.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import classStatus.pojo.Command;
import classStatus.pojo.LessonArrange;
import classStatus.service.impl.CommandServiceImpl;
import classStatus.service.impl.LessonArrangeServiceImpl;
import classStatus.util.LoggerUtil;

@Service
public class OpenJob implements Job {

	private Integer classroomId;
	private Logger log = LoggerFactory.getLogger(OpenJob.class);

	/**
	 * 获取classroomId
	 * 
	 * @param classroomId
	 */
	public void getClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	@Autowired
	private CommandServiceImpl cmd;
	@Autowired
	private LessonArrangeServiceImpl lesson;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();// 获取当前的时间
		String dateTime = sdf.format(time);// 格式化时间
		String date=dateTime.substring(0,10);
		String hour = sdf.format(time).substring(11, 13);//截取时间点,用于匹配
		// 查找数据库中的中的课室安排计划
		LessonArrange arrange = lesson.queryByDateAndId(date, 101);
		if(arrange==null) {
			return;
		}
		// 根据时间匹配要执行的任务
		int id=101;//课室编号
		switch (hour) {
		//7:30检查早读
		case "07": {
			int moringReading = arrange.getMorningReading();
			// moringReading ==1表示有课，有课即发送打开灯的指令
			if (moringReading == 1) {
				this.openCommand(id);
			} else if (moringReading == 0) {
				this.closeCommand(id);
			}
		}
			break;
			//8:15第一节课
		case "08": {
			int lesson1 = arrange.getLesson1();
			if (lesson1 == 1) {
				this.openCommand(id);
			} else {
				this.closeCommand(id);
			}
		}
			break;
			//10:15
		case "10": {
			int lesson3 = arrange.getLesson3();
			if (lesson3 == 1) {
				this.openCommand(id);
			} else {
				this.closeCommand(id);
			}
		}
			break;
			//12:20
		case "12": {
			int noon = arrange.getNoon();
			if (noon == 1) {
				this.openCommand(id);
			} else {
				this.closeCommand(id);
			}
		}
			break;
			//14:15
		case "14": {
			int lesson5 = arrange.getLesson5();
			if (lesson5== 1) {
				this.openCommand(id);
			} else {
				this.closeCommand(id);
			}
		}
			break;
			//16:15
		case "16": {
			int lesson7 = arrange.getLesson7();
			if (lesson7 == 1) {
				this.openCommand(id);
			} else {
				this.closeCommand(id);
			}
		}
			break;
			//18:20
		case "18": {
			int dinner = arrange.getDinner();
			if (dinner == 1) {
				this.openCommand(id);
			} else {
				this.closeCommand(id);
			}
		}
			break;
			//19:00
		case "19": {
			int nightClass = arrange.getNightClasses();
			if (nightClass == 1) {
				this.openCommand(id);
			} else {
				this.closeCommand(id);
			}
		}
			break;
		default:
			break;
		}

	}

	public void openCommand(int classroomId) {
		Command command = new Command();
		command.setClassroom_Id(classroomId);
		// 设置指令
		command.setTotal_switch(1);
		command.setL1_switch(1);
		command.setL2_switch(1);
		command.setL3_switch(1);
		command.setL4_switch(1);
		command.setF1_switch(1);
		command.setF2_switch(1);
		command.setF3_switch(1);
		command.setF4_switch(1);
		command.setA1_switch(1);
		command.setA1_pattern(1);
		command.setA1_wind_speed(1);
		command.setA1_temperature(1.0);
		command.setA2_switch(1);
		command.setA2_pattern(1);
		command.setA2_wind_speed(1);
		command.setA1_temperature(36.0);
		try {
			cmd.insertCommand(command);
			log.info("插入开灯指令成功" + "  " + new Date());
			//日志记录
			LoggerUtil log=new LoggerUtil();
			log.OpenLog(101);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void closeCommand(int classroomId) {
		Command command = new Command();
		command.setClassroom_Id(classroomId);
		// 设置指令
		command.setTotal_switch(1);
		command.setL1_switch(0);
		command.setL2_switch(0);
		command.setL3_switch(0);
		command.setL4_switch(0);
		command.setF1_switch(0);
		command.setF2_switch(0);
		command.setF3_switch(0);
		command.setF4_switch(0);
		command.setA1_switch(0);
		command.setA1_pattern(0);
		command.setA1_wind_speed(0);
		command.setA1_temperature(0.0);
		command.setA2_switch(0);
		command.setA2_pattern(0);
		command.setA2_wind_speed(0);
		command.setA1_temperature(36.0);
		try {
			cmd.insertCommand(command);
			log.info("插入关灯指令成功" + "  " + new Date());
			LoggerUtil log=new LoggerUtil();
			log.CloseLog(101);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
