package classStatus.service;

import java.util.List;

import classStatus.pojo.LessonArrange;

public interface LessonArrangeService {
	/**
	 * 添加课室安排表
	 * @param lessonArrange
	 * @return
	 */
	int insertClassroomLessonArrange(LessonArrange lessonArrange);
	
	/**
	 * 更新教室安排记录
	 * @param lessonArrange
	 * @return
	 */
	int updateClassroomLessonArrange(LessonArrange lessonArrange);
	
	/**
	 * 查询所有课室的安排表
	 * @return
	 */
	List<LessonArrange> queryAllClassroomLessonArrange();
	
	/**
	 * 查询课室排课情况
	 * @param classId
	 * @return
	 */
	LessonArrange queryClassroomLessonArrangeByClassroomId(int classroom_id);
	
	/**
	 * 根据课室id删除课室安排表
	 * @return
	 */
	int deleteClassroomLessonArrangeByClassroomId(LessonArrange la);
	
	/**
	 * 根据日期和课室id查找课室安排
	 * @param dateTime
	 * @param id
	 * @return
	 */
	LessonArrange queryByDateAndId(String dateTime,int classroomId);
	
	/**
	 * 根据课室id,周数,星期几查询课室安排信息
	 * @param classroomId
	 * @param schoolWeek
	 * @param datesOfWeek
	 * @return
	 */
	LessonArrange queryByIdAndWeekAndDates(LessonArrange arrange);
	
}
