package classStatus.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import classStatus.pojo.Log;
import classStatus.service.impl.LogServiceImpl;

@Controller
@RequestMapping(value="/log")
public class LogAction {
	@Autowired
	private LogServiceImpl logServiceImpl;
	
	@RequestMapping(value="/queryAllLog.do")
	@ResponseBody
	public String  queryAllLog() {
		Gson gson=new Gson();
		List<Log> logList=logServiceImpl.queryAllLog();
		String logStr=gson.toJson(logList);
		return logStr;
	}
}
