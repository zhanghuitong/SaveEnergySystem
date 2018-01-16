package classStatus.service;

import java.util.List;

import classStatus.pojo.Log;

public interface LogService {
	/**
	 * 添加日志信息
	 * @param log
	 * @return
	 */
	int insertLog(Log log);
	
	/**
	 * 更新日志信息
	 * @param log
	 * @return
	 */
	int updateLog(Log log);
	
	/**
	 * 按日志id删除日志
	 * @param logId
	 * @return
	 */
	int deleteLogByLogId(String logId);
	
	/**
	 * 按课室Id查询日志记录
	 * @param classroomId
	 * @return
	 */
	Log queryLogByClassId(int classroomId);
	
	/**
	 * 查询所有的日志信息
	 * @return
	 */
	List<Log> queryAllLog();
}
