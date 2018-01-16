package classStatus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import classStatus.dao.LessonArrangeMapper;
import classStatus.pojo.LessonArrange;
import classStatus.service.LessonArrangeService;

@Service
public class LessonArrangeServiceImpl implements LessonArrangeService{
	@Autowired
	private LessonArrangeMapper lessonArrangeMapper;

	public int insertClassroomLessonArrange(LessonArrange lessonArrange) {
		return this.lessonArrangeMapper.insertClassroomLessonArrange(lessonArrange);
	}

	public int updateClassroomLessonArrange(LessonArrange lessonArrange) {
		return this.lessonArrangeMapper.updateClassroomLessonArrange(lessonArrange);
	}

	public List<LessonArrange> queryAllClassroomLessonArrange() {
		return this.lessonArrangeMapper.queryAllClassroomLessonArrange();
	}

	public LessonArrange queryClassroomLessonArrangeByClassroomId(int classroom_id) {
		return this.lessonArrangeMapper.queryClassroomLessonArrangeByClassroomId(classroom_id);
	}


	public int deleteClassroomLessonArrangeByClassroomId(LessonArrange la) {
		return this.lessonArrangeMapper.deleteClassroomLessonArrangeByClassroomId(la);
	}

	@Override
	public LessonArrange queryByDateAndId(String dateTime, int classroomId) {
		return this.lessonArrangeMapper.queryArrangeByDateAndId(dateTime, classroomId);
	}

	@Override
	public LessonArrange queryByIdAndWeekAndDates(LessonArrange arrange) {
		return this.lessonArrangeMapper.queryByIdAndWeekAndDates(arrange);
	}
	
	
}
