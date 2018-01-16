package classStatus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import classStatus.dao.ClassStatusMapper;
import classStatus.pojo.ClassStatus;
import classStatus.service.ClassStatusService;
@Service
public class ClassStatusServiceImpl implements ClassStatusService{
	@Autowired
	private ClassStatusMapper classStatusMapper;
	
	public ClassStatus queryClassroomStatusByClassroomName(String classroomName) {
			ClassStatus classStatus = this.classStatusMapper.queryClassroomStatusByClassroomName(classroomName);
		return classStatus;
	}

	public List<ClassStatus> queryAllClassroomStatus() {
		List<ClassStatus> classStatusList=this.classStatusMapper.queryAllClassroomStatus();
		return classStatusList;
	}

	public int updateClassroomStatus(ClassStatus classStatus) {
		return this.classStatusMapper.updateClassroomStatus(classStatus);
	}

	public int insertClassroomStatus(ClassStatus classStatus) {
		return this.classStatusMapper.insertClassroomStatus(classStatus);
	}

}
 