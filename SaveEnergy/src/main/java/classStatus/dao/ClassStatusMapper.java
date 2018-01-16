package classStatus.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import classStatus.pojo.ClassStatus;

@Repository
public interface ClassStatusMapper {
	
	
	/**
	 * 根据课室名查找课室状态
	 * @param ClassName
	 * @return
	 */
	ClassStatus queryClassroomStatusByClassroomName(String className);
	
	/**
	 * 查询所有课室的状态
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
	 * 插入课室状态
	 * @param classStatus
	 * @return
	 */
	int insertClassroomStatus(ClassStatus classStatus);
	
}	
