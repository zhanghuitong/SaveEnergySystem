package classStatus.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="command")
public class CommandAction {
	
	@RequestMapping(value="insertCommand")
	public String insertCommand() {
		return null;
	}
	
	@RequestMapping(value="updateCommand")
	public String updateCommand() {
		return null;
	}
	
	@RequestMapping(value="queryAllCommand")
	public String queryAllCommand() {
		return null;
	}
	
	@RequestMapping(value="queryCommandByClassroomId")
	public String queryCommandByClassroomId() {
		return null;
	}
}
