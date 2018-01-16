package classStatus.service;

import java.util.List;

import classStatus.pojo.ClassStatus;

public interface ClassStatusService {
	
	/**
	 * 根据课室名查询课室状态
	 * @param ClassName
	 * @return
	 */
	ClassStatus queryClassroomStatusByClassroomName(String ClassName);
	
	/**
	 * 查询所有课室状态
	 * @return
	 */
	List<ClassStatus> queryAllClassroomStatus();
	
	/**
	 * 更新课室状态
	 * @param classStatus
	 * @return
	 */
	int updateClassroomStatus(ClassStatus classStatus);
	
	/**
	 * 添加课室状态
	 * @param classStatus
	 * @return
	 */
	int insertClassroomStatus(ClassStatus classStatus);
}
