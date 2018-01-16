package classStatus.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import classStatus.pojo.LessonArrange;
import classStatus.service.impl.LessonArrangeServiceImpl;

@Controller
@RequestMapping(value = "lessonArrange")
public class LessonArrangeAction {

	@Autowired
	private LessonArrangeServiceImpl lessonArrangeServiceImpl;

	@RequestMapping(value = "insertLessonArrange.do")
	public String  insertLessonArrange(@RequestParam("classroomId") Integer classroomId,
			@RequestParam("schoolWeek") Integer schoolWeek,
			@RequestParam("datesOfWeek") Integer datesOfWeek,
			@RequestParam("date") String date, 
			@RequestParam("checkboxStr") String checkboxStr,
			HttpServletRequest request) {
		String[] checkbox = checkboxStr.split(",");
		System.out.println("切分的数组" + checkbox.toString());
		Integer[] str = new Integer[checkbox.length];// 动态定义一个数组的长度
		// 将字符串数组转换为整数数组
		for (int i = 0; i < checkbox.length; i++) {
			str[i] = Integer.parseInt(checkbox[i]);
		}
		LessonArrange lessonArrange = new LessonArrange();
		lessonArrange.setClassroomId(classroomId);
		lessonArrange.setSchoolWeek(schoolWeek);
		lessonArrange.setDatesOfWeek(datesOfWeek);
		lessonArrange.setDate(date);
		lessonArrange.setMoringReading(str[0]);
		lessonArrange.setLesson1(str[1]);
		lessonArrange.setLesson2(str[2]);
		lessonArrange.setLesson3(str[3]);
		lessonArrange.setLesson4(str[4]);
		lessonArrange.setNoon(str[5]);
		lessonArrange.setLesson5(str[6]);
		lessonArrange.setLesson6(str[7]);
		lessonArrange.setLesson7(str[8]);
		lessonArrange.setLesson8(str[9]);
		lessonArrange.setDinner(str[10]);
		lessonArrange.setNightClasses(str[11]);

		int result = this.lessonArrangeServiceImpl.insertClassroomLessonArrange(lessonArrange);
		if (result != 0) {
			return "../success.html";
		} else {
			return "../failed.html";
		}
	}

	@RequestMapping(value = "updateLessonArrange.do")
	public String updateLessonArrange(
			@RequestParam("classroomId") Integer classroomId,
			@RequestParam("schoolWeek") Integer schoolWeek, 
			@RequestParam("datesOfWeek") Integer datesOfWeek,
			@RequestParam("date") String date,
			@RequestParam(value="morningReading",required=false) Integer morningReading,
			@RequestParam(value="lesson1",required=false) Integer lesson1,
			@RequestParam(value="lesson2",required=false) Integer lesson2,
			@RequestParam(value="lesson3",required=false) Integer lesson3, 
			@RequestParam(value="lesson4",required=false) Integer lesson4,
			@RequestParam(value="noon",required=false) Integer noon, 
			@RequestParam(value="lesson5",required=false) Integer lesson5,
			@RequestParam(value="lesson6",required=false) Integer lesson6,
			@RequestParam(value="lesson7",required=false) Integer lesson7,
			@RequestParam(value="lesson8",required=false) Integer lesson8,
			@RequestParam(value="lesson9",required=false) Integer dinner,
			@RequestParam(value="lesson10",required=false) Integer nightClasses) {

		LessonArrange lessonArrange = new LessonArrange();
		lessonArrange.setClassroomId(classroomId);
		lessonArrange.setSchoolWeek(schoolWeek);
		lessonArrange.setDatesOfWeek(datesOfWeek);
		lessonArrange.setDate(date);
		lessonArrange.setMoringReading(morningReading);
		lessonArrange.setLesson1(lesson1);
		lessonArrange.setLesson2(lesson2);
		lessonArrange.setLesson3(lesson3);
		lessonArrange.setLesson4(lesson4);
		lessonArrange.setNoon(noon);
		lessonArrange.setLesson5(lesson5);
		lessonArrange.setLesson6(lesson6);
		lessonArrange.setLesson7(lesson7);
		lessonArrange.setLesson8(lesson8);
		lessonArrange.setDinner(dinner);
		lessonArrange.setNightClasses(nightClasses);
		System.out.println(lessonArrange.toString());
		int result = this.lessonArrangeServiceImpl.updateClassroomLessonArrange(lessonArrange);
		if (result != 0) {
			return "../success.html";
		} else {
			return "../failed.html";
		} 
	}
	
	@RequestMapping(value="modifyMessage.do")
	public void modifyArrange(
			@RequestParam("id") Integer classroomId,
			@RequestParam("schoolWeek") Integer schoolWeek,
			@RequestParam("datesOfWeek") Integer datesOfWeek,
			HttpServletRequest request,
			HttpServletResponse response) {
		LessonArrange arrange=new LessonArrange();
		arrange.setClassroomId(classroomId);
		arrange.setSchoolWeek(schoolWeek);
		arrange.setDatesOfWeek(datesOfWeek);
		LessonArrange la=this.lessonArrangeServiceImpl.queryByIdAndWeekAndDates(arrange);
		request.setAttribute("la", la);
		try {
			request.getRequestDispatcher("/classroomArrange/modifyArrange.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "deleteLessonArrange.do")
	public int deleteLessonArrange(
			@RequestParam("classroomId") Integer classroomId,
			@RequestParam("schoolWeek") Integer schoolWeek,
			@RequestParam("datesOfWeek") Integer datesOfWeek
			) {
		LessonArrange la=new LessonArrange();
		la.setClassroomId(classroomId);
		la.setSchoolWeek(schoolWeek);
		la.setDatesOfWeek(datesOfWeek);
		int result = this.lessonArrangeServiceImpl.deleteClassroomLessonArrangeByClassroomId(la);
		if (result != 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "queryAllLessonArrange.do")
	public String queryAllLessonArrange() {
		List<LessonArrange> lessonArrangeList = this.lessonArrangeServiceImpl.queryAllClassroomLessonArrange();
		Gson gson=new Gson();
		String arrangeStr=gson.toJson(lessonArrangeList);
		return arrangeStr;
	}

	@RequestMapping(value = "queryLessonArrangeByClassroomId")
	public String queryLessonArrangeByClassroomId(@RequestParam("classroomId") Integer classroomId) {
		LessonArrange lessonArrange = this.lessonArrangeServiceImpl
				.queryClassroomLessonArrangeByClassroomId(classroomId);

		return null;
	}

}
