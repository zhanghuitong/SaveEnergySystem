package classStatus.dao;

import java.util.List;

import classStatus.pojo.LessonArrange;

public interface LessonArrangeMapper {
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
	
	
	int deleteClassroomLessonArrangeByClassroomId(LessonArrange la);
	
	/**
	 * 查找每个时段的课室安排
	 * @param name
	 * @return
	 */
	LessonArrange queryArrangeByDateAndId(String dateTime,int classroomId);
	
	/**
	 * 根据课室id,周数,星期几查询课室安排信息
	 * @param classroomId
	 * @param schoolWeek
	 * @param datesOfWeek
	 * @return
	 */
	LessonArrange queryByIdAndWeekAndDates(LessonArrange arrange);
	
}
