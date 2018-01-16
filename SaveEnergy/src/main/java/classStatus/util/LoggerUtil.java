package classStatus.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import classStatus.dao.LogMapper;
import classStatus.pojo.Log;
import classStatus.service.impl.LogServiceImpl;

@Service
public class LoggerUtil {
	@Autowired
	private  LogServiceImpl logServiceImpl;
	
	@Autowired
	private LogMapper logMapper;
	
	/**
	 * 记录课室设备全开,只记录设备的开关
	 * @param classroomId
	 */
	public  void  OpenLog(int classroomId) {
		String remark="根据课程表定时开";
		insertLog(classroomId, "开", remark);
	}
	
	/**
	 * 记录全关
	 * @param classroomId
	 */
	public  void CloseLog(int classroomId) {
		String remark="根据课程表定时关";
		insertLog(classroomId, "关", remark);
	}
	
	public  void insertLog(int classroomId,String status,String remark) {
		/*
		 * deviceList存放设备的名称
		 */
		ArrayList<String> deviceList=new ArrayList<String>();
		deviceList.add("L1_switch");
		deviceList.add("L2_switch");
		deviceList.add("L3_switch");
		deviceList.add("L4_switch");
		deviceList.add("F1_switch");
		deviceList.add("F2_switch");
		deviceList.add("F3_switch");
		deviceList.add("F4_switch");
		deviceList.add("A1_switch");
		deviceList.add("A2_switch");
		
		
		String time=DateTransform.trans(new Date());
		String uuid=UUID.randomUUID().toString().substring(0,4);
		String loggerId=time+uuid;
		/*
		 * 依次写入每个设备关闭的记录
		 */
		
		for(int i=0;i<deviceList.size();i++) {
			Log log=new Log();
			log.setLog_id(loggerId);
			log.setClassroom_id(classroomId);
			log.setOperacte_device(deviceList.get(i));
			log.setStatus("开");
			log.setOperaction_time(time);
			this.logServiceImpl.insertLog(log);
		}
	}
	
	public  void toggleLog(String deviceName,int classroomId,String status) {
		String time=DateTransform.trans(new Date());
		String uuid=UUID.randomUUID().toString().substring(0,4);
		String loggerId=time+uuid;
		Log log=new Log();
		log.setLog_id(loggerId);
		log.setClassroom_id(classroomId);
		log.setOperacte_device(deviceName);
		log.setOperaction_time(time);
		log.setStatus(status);
		System.out.println(log.toString());
		try {
			logMapper.insertLog(log);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
