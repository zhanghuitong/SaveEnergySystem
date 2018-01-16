package classStatus.action;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import classStatus.pojo.ClassStatus;
import classStatus.pojo.Command;
import classStatus.pojo.Log;
import classStatus.service.LogService;
import classStatus.service.impl.ClassStatusServiceImpl;
import classStatus.service.impl.CommandServiceImpl;
import classStatus.service.impl.LogServiceImpl;
import classStatus.util.DateTransform;
import classStatus.util.LoggerUtil;

@Controller
@RequestMapping(value = "/classStatus")
public class ClassStatusAction {

	@Autowired
	private ClassStatusServiceImpl classStatusServiceImpl;
	@Autowired
	private CommandServiceImpl commandServiceImpl;
	@Autowired
	private LogServiceImpl logServiceImpl;
	
	@RequestMapping(value = "queryByClassName.do")
	public String queryClassroomStatusByClassroomName(
			@RequestParam("className") String className ,
			HttpServletRequest request,
			HttpServletResponse response)
	{
		ClassStatus classStatus = this.classStatusServiceImpl.queryClassroomStatusByClassroomName(className);
		System.out.println(classStatus.toString());
		request.setAttribute("classStatus",classStatus);
		return "/updateClassroom.jsp";
	}
	 
	@ResponseBody
	@RequestMapping(value = "queryAllClassroomStatus")
	public String queryAllClassroomStatus() {
		List<ClassStatus> classStatusList = this.classStatusServiceImpl.queryAllClassroomStatus();
		Gson gson = new Gson();
		String list = gson.toJson(classStatusList);
		return list;//返回gson数据
	}

	@RequestMapping(value="updateClassroomStatus")
	public String   updateClassStatus(
			@RequestParam("classroom_id") Integer classroomId,
			@RequestParam("classroom_name") String classroomName,
			@RequestParam("ip") String ip,
			@RequestParam("connection_status") Integer connectionStatus,
			@RequestParam("total_switch") Integer totalSwitch,
			@RequestParam("L1_switch") Integer l1Switch,
			@RequestParam("L2_switch") Integer l2Switch,
			@RequestParam("L3_switch") Integer l3Switch,
			@RequestParam("L4_switch") Integer l4Switch,
			@RequestParam("F1_switch") Integer f1Switch,
			@RequestParam("F2_switch") Integer f2Switch,
			@RequestParam("F3_switch") Integer f3Switch,
			@RequestParam("F4_switch") Integer f4Switch,
			@RequestParam("A1_switch") Integer a1Switch,
			@RequestParam("A1_pattern") Integer a1Pattern,
			@RequestParam("A1_wind_speed") Integer a1WindSpeed,
			@RequestParam("A1_temperature") Double  a1Temperature,
			@RequestParam("A2_switch") Integer a2Switch,
			@RequestParam("A2_pattern") Integer a2Pattern,
			@RequestParam("A2_wind_speed") Integer a2WindSpeed,
			@RequestParam("A2_temperature") Double a2Temperature,
			@RequestParam("temperature")   Double  temperature,
			@RequestParam("humidity") Double humidity,
			HttpServletRequest request
   			) {
		//将接收的参数设置到一个ClassStatus对象中
				ClassStatus classStatus=new ClassStatus();
				classStatus.setClassroomId(classroomId);
				classStatus.setClassroomName(classroomName);
				classStatus.setIp(ip);
				classStatus.setConnectionStatus(connectionStatus);
				classStatus.setTotalSwitch(totalSwitch);
				classStatus.setL1Switch(l1Switch);
				classStatus.setL2Switch(l2Switch);
				classStatus.setL3Switch(l3Switch);
				classStatus.setL4Switch(l4Switch);
				classStatus.setF1Switch(f1Switch);
				classStatus.setF2Switch(f2Switch);
				classStatus.setF3Switch(f3Switch);
				classStatus.setF4Switch(f4Switch);
				classStatus.setA1Switch(a1Switch);
				classStatus.setA1Pattern(a1Pattern);
				classStatus.setA1WindSpeed(a1WindSpeed);
				classStatus.setA1Temperature(a1Temperature);
				classStatus.setA2Switch(a2Switch);
				classStatus.setA2Pattern(a2Pattern);
				classStatus.setA2WindSpeed(a2WindSpeed);
				classStatus.setA2Temperature(a2Temperature);
				classStatus.setTemperature(temperature);
				classStatus.setHumidity(humidity);
				
		int result=this.classStatusServiceImpl.updateClassroomStatus(classStatus);
		if(result!=0) {
			return "1";
		}else {
			return "0";
		}
	}

	@RequestMapping(value = "insertClassroomStatus")
	public int insertClassroomStatus(Model model) {
		ClassStatus classStatus = (ClassStatus) model.asMap().get("classStatus");
		int result = this.classStatusServiceImpl.insertClassroomStatus(classStatus);
		if (result != 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	/**
	 * 修改课室状态时插入一条指令更新设备的状态,存在一个问题,用户在点击多次按钮会插入重复的指令
	 * @param classroomName
	 * @param data
	 * @param deviceName
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="insertCommand.do")
	public String insertCommand(
			@RequestParam("name") String classroomName,
			@RequestParam("data") Integer data,
			@RequestParam("deviceName") String deviceName
			) {
		ClassStatus classStatus=this.classStatusServiceImpl.queryClassroomStatusByClassroomName(classroomName);
		
		/*
		 * data==1代表灯是开的,0代表灯是关的
		 */
		System.out.println(data);
		System.out.println(deviceName);
		if(deviceName.equals("totalSwitch")) {
			if(data==1) {
				classStatus.setTotalSwitch(0);
			}else {
				classStatus.setTotalSwitch(1);
			}
		}else if(deviceName.equals("l4Switch")) {
			if(data==1) {
				classStatus.setL4Switch(0);
			}else {
				classStatus.setL4Switch(1);
			}
		}else if(deviceName.equals("f4Switch")) {
			if(data==1) {
				classStatus.setF4Switch(0);
			}else {
				classStatus.setF4Switch(1);
			}
		}else if(deviceName.equals("a1Switch")) {
			if(data==1) {
				classStatus.setA1Switch(0);
			}else {
				classStatus.setA1Switch(1);
			}
		}else if(deviceName.equals("l1Switch")) {
			if(data==1) {
				classStatus.setL1Switch(0);
			}else{
				classStatus.setL1Switch(1);
			}
		}else if(deviceName.equals("l2Switch")) {
			if(data==1) {
				classStatus.setL2Switch(0);
			}else {
				classStatus.setL2Switch(1);
			}
		}else if(deviceName.equals("l3Switch")) {
			if(data==1){
				classStatus.setL3Switch(0);
			}else {
				classStatus.setL3Switch(1);
			}
			
		}else if(deviceName.equals("f1Switch")) {
			
			if(data==1) {
				classStatus.setF1Switch(0);
			}else {
				classStatus.setF1Switch(1);
			}
		}else if(deviceName.equals("f2Switch")){
			if(data==1) {
				classStatus.setF2Switch(0);
			}else {
				classStatus.setF2Switch(1);
			}
		}else if(deviceName.equals("f3Switch")) {
			if(data==1) {
				classStatus.setF3Switch(0);
			}else {
				classStatus.setF3Switch(1);
			}
		}
		
		
		Command command=new Command();
		command.setClassroom_Id(classStatus.getClassroomId());
		command.setTotal_switch(classStatus.getTotalSwitch());
		command.setL1_switch(classStatus.getL1Switch());
		command.setL2_switch(classStatus.getL2Switch());
		command.setL3_switch(classStatus.getL3Switch());
		command.setL4_switch(classStatus.getL4Switch());
		command.setF1_switch(classStatus.getF1Switch());
		command.setF2_switch(classStatus.getF2Switch());
		command.setF3_switch(classStatus.getF3Switch());
		command.setF4_switch(classStatus.getF4Switch());
		command.setA1_switch(classStatus.getA1Switch());
		command.setA1_pattern(classStatus.getA1Pattern());
		command.setA1_wind_speed(classStatus.getA1WindSpeed());
		command.setA1_temperature(classStatus.getA1Temperature());
		command.setA2_switch(classStatus.getA2Switch());
		command.setA2_pattern(classStatus.getA2Pattern());
		command.setA2_wind_speed(classStatus.getA2WindSpeed());
		command.setA2_temperature(classStatus.getA2Temperature());
		System.out.println("指令"+command.toString());
		
		int result =this.commandServiceImpl.insertCommand(command);
		String status="";
		if(data==1) {
			status="关";
		}else {
			status="开";
		}
		
		String time=DateTransform.trans(new Date());
		String uuid=UUID.randomUUID().toString().substring(0,4);
		String loggerId=time+uuid;
		Log log=new Log();
		log.setLog_id(loggerId);
		log.setClassroom_id(101);
		log.setOperacte_device(deviceName);
		log.setOperaction_time(time);
		log.setStatus(status);
		System.out.println(log.toString());
		this.logServiceImpl.insertLog(log);
		if(result!=0) {
			return "1";
		}else {
			return "0";
		}
	}

}
