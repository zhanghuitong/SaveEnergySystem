package classStatus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import classStatus.dao.CommandMapper;
import classStatus.pojo.Command;
import classStatus.service.CommandService;

@Service
public class CommandServiceImpl implements CommandService{
	@Autowired
	private CommandMapper commandMapper;

	public int insertCommand(Command command) {
		return this.commandMapper.insertCommand(command);
	}

	public int updateCommand(Command command) {
		return this.commandMapper.updateCommand(command);
	}

	public int deleteCommandByClassroomId(int classroom_id) {
		return this.commandMapper.deleteCommandByClassroomId(classroom_id);
	}

	public List<Command> queryAllCommand() {
		return this.commandMapper.queryAllCommand();
	}

	public Command queryCommandByClassroom_id(int classroom_id) {
		return this.commandMapper.queryCommandByClassroom_id(classroom_id);
	}

}
