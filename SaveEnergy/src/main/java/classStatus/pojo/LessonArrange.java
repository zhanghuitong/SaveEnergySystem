package classStatus.pojo;

import java.io.Serializable;
import java.util.Date;

public class LessonArrange implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer classroomId;
	private Integer schoolWeek;
	private Integer datesOfWeek;
	private String date;
	private Integer morningReading;
	private Integer lesson1;
	private Integer lesson2;
	private Integer lesson3;
	private Integer lesson4;
	private Integer lesson5;
	private Integer noon;
	private Integer lesson6;
	private Integer lesson7;
	private Integer lesson8;
	private Integer dinner;
	private Integer nightClasses;
	
	public LessonArrange() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the classroomId
	 */
	public Integer getClassroomId() {
		return classroomId;
	}

	/**
	 * @param classroomId the classroomId to set
	 */
	public void setClassroomId(Integer classroomId) {
		this.classroomId = classroomId;
	}

	/**
	 * @return the schoolWeek
	 */
	public Integer getSchoolWeek() {
		return schoolWeek;
	}

	/**
	 * @param schoolWeek the schoolWeek to set
	 */
	public void setSchoolWeek(Integer schoolWeek) {
		this.schoolWeek = schoolWeek;
	}

	/**
	 * @return the datesOfWeek
	 */
	public Integer getDatesOfWeek() {
		return datesOfWeek;
	}

	/**
	 * @param datesOfWeek the datesOfWeek to set
	 */
	public void setDatesOfWeek(Integer datesOfWeek) {
		this.datesOfWeek = datesOfWeek;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the moringReading
	 */
	public Integer getMorningReading() {
		return morningReading;
	}

	/**
	 * @param moringReading the moringReading to set
	 */
	public void setMoringReading(Integer morningReading) {
		this.morningReading = morningReading;
	}

	/**
	 * @return the lesson1
	 */
	public Integer getLesson1() {
		return lesson1;
	}

	/**
	 * @param lesson1 the lesson1 to set
	 */
	public void setLesson1(Integer lesson1) {
		this.lesson1 = lesson1;
	}

	/**
	 * @return the lesson2
	 */
	public Integer getLesson2() {
		return lesson2;
	}

	/**
	 * @param lesson2 the lesson2 to set
	 */
	public void setLesson2(Integer lesson2) {
		this.lesson2 = lesson2;
	}

	/**
	 * @return the lesson3
	 */
	public Integer getLesson3() {
		return lesson3;
	}

	/**
	 * @param lesson3 the lesson3 to set
	 */
	public void setLesson3(Integer lesson3) {
		this.lesson3 = lesson3;
	}

	/**
	 * @return the lesson4
	 */
	public Integer getLesson4() {
		return lesson4;
	}

	/**
	 * @param lesson4 the lesson4 to set
	 */
	public void setLesson4(Integer lesson4) {
		this.lesson4 = lesson4;
	}

	/**
	 * @return the lesson5
	 */
	public Integer getLesson5() {
		return lesson5;
	}

	/**
	 * @param lesson5 the lesson5 to set
	 */
	public void setLesson5(Integer lesson5) {
		this.lesson5 = lesson5;
	}

	/**
	 * @return the noon
	 */
	public Integer getNoon() {
		return noon;
	}

	/**
	 * @param noon the noon to set
	 */
	public void setNoon(Integer noon) {
		this.noon = noon;
	}

	/**
	 * @return the lesson6
	 */
	public Integer getLesson6() {
		return lesson6;
	}

	/**
	 * @param lesson6 the lesson6 to set
	 */
	public void setLesson6(Integer lesson6) {
		this.lesson6 = lesson6;
	}

	/**
	 * @return the lesson7
	 */
	public Integer getLesson7() {
		return lesson7;
	}

	/**
	 * @param lesson7 the lesson7 to set
	 */
	public void setLesson7(Integer lesson7) {
		this.lesson7 = lesson7;
	}

	/**
	 * @return the lesson8
	 */
	public Integer getLesson8() {
		return lesson8;
	}

	/**
	 * @param lesson8 the lesson8 to set
	 */
	public void setLesson8(Integer lesson8) {
		this.lesson8 = lesson8;
	}

	/**
	 * @return the dinner
	 */
	public Integer getDinner() {
		return dinner;
	}

	/**
	 * @param dinner the dinner to set
	 */
	public void setDinner(Integer dinner) {
		this.dinner = dinner;
	}

	/**
	 * @return the nightClasses
	 */
	public Integer getNightClasses() {
		return nightClasses;
	}

	/**
	 * @param nightClasses the nightClasses to set
	 */
	public void setNightClasses(Integer nightClasses) {
		this.nightClasses = nightClasses;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LessonArrange [classroomId=" + classroomId + ", schoolWeek=" + schoolWeek + ", datesOfWeek="
				+ datesOfWeek + ", date=" + date + ", moringReading=" + morningReading + ", lesson1=" + lesson1
				+ ", lesson2=" + lesson2 + ", lesson3=" + lesson3 + ", lesson4=" + lesson4 + ", lesson5=" + lesson5
				+ ", noon=" + noon + ", lesson6=" + lesson6 + ", lesson7=" + lesson7 + ", lesson8=" + lesson8
				+ ", dinner=" + dinner + ", nightClasses=" + nightClasses + "]";
	}

	
}
