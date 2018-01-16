package classStatus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import classStatus.dao.LogMapper;
import classStatus.pojo.Log;
import classStatus.service.LogService;
@Service
public class LogServiceImpl implements LogService {
	@Autowired
	private LogMapper logMapper;

	@Override
	public int insertLog(Log log) {
		return this.logMapper.insertLog(log);
	}

	@Override
	public int updateLog(Log log) {
		return 0;
	}

	@Override
	public int deleteLogByLogId(String logId) {
		return 0;
	}

	@Override
	public Log queryLogByClassId(int classroomId) {
		return this.logMapper.queryLogByClassId(classroomId);
	}

	@Override
	public List<Log> queryAllLog() {
		return this.logMapper.queryAllLog();
	}

}
