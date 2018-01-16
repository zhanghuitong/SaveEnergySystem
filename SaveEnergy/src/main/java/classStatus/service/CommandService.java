package classStatus.service;

import java.util.List;

import classStatus.pojo.Command;

public interface CommandService {
	
	
	/**
	 * 添加指令记录
	 * @param command
	 * @return
	 */
	int insertCommand(Command command);
	
	/**
	 * 更新指令
	 * @param command
	 * @return
	 */
	int updateCommand(Command command);
	
	/**
	 * 删除指令
	 * @param classroom_id
	 * @return
	 */
	int deleteCommandByClassroomId(int classroom_id);
	
	/**
	 * 查询所有指令
	 * @return
	 */
	List<Command> queryAllCommand();
	
	/**
	 * 按课室id查询指令
	 * @param classroom_id
	 * @return
	 */
	Command queryCommandByClassroom_id(int classroom_id);
	
}
