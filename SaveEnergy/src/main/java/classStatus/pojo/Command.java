package classStatus.pojo;

import java.io.Serializable;

public class Command implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer classroom_id;
	private Integer total_switch;//总开关
	private Integer L1_switch;
	private Integer L2_switch;
	private Integer L3_switch;
	private Integer L4_switch;
	private Integer F1_switch;
	private Integer F2_switch;
	private Integer F3_switch;
	private Integer F4_switch;
	private Integer A1_switch;
	private Integer A1_pattern;
	private Integer A1_wind_speed;
	private Double A1_temperature;
	private Integer A2_switch;
	private Integer A2_pattern;
	private Integer A2_wind_speed;
	private Double A2_temperature;
	
	
	public Command() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the classroom_Id
	 */
	public Integer getClassroom_id() {
		return classroom_id;
	}
	/**
	 * @param classroom_Id the classroom_Id to set
	 */
	public void setClassroom_Id(Integer classroom_id) {
		this.classroom_id = classroom_id;
	}
	/**
	 * @return the totalSwitch
	 */
	public Integer getTotal_switch() {
		return total_switch;
	}
	/**
	 * @param totalSwith the totalSwith to set
	 */
	public void setTotal_switch(Integer total_switch) {
		this.total_switch = total_switch;
	}
	/**
	 * @return the l1_switch
	 */
	public Integer getL1_switch() {
		return L1_switch;
	}
	/**
	 * @param l1_switch the l1_switch to set
	 */
	public void setL1_switch(Integer l1_switch) {
		L1_switch = l1_switch;
	}
	/**
	 * @return the l2_switch
	 */
	public Integer getL2_switch() {
		return L2_switch;
	}
	/**
	 * @param l2_switch the l2_switch to set
	 */
	public void setL2_switch(Integer l2_switch) {
		L2_switch = l2_switch;
	}
	/**
	 * @return the l3_switch
	 */
	public Integer getL3_switch() {
		return L3_switch;
	}
	/**
	 * @param l3_switch the l3_switch to set
	 */
	public void setL3_switch(Integer l3_switch) {
		L3_switch = l3_switch;
	}
	/**
	 * @return the l4_switch
	 */
	public Integer getL4_switch() {
		return L4_switch;
	}
	/**
	 * @param l4_switch the l4_switch to set
	 */
	public void setL4_switch(Integer l4_switch) {
		L4_switch = l4_switch;
	}
	/**
	 * @return the f1_switch
	 */
	public Integer getF1_switch() {
		return F1_switch;
	}
	/**
	 * @param f1_switch the f1_switch to set
	 */
	public void setF1_switch(Integer f1_switch) {
		F1_switch = f1_switch;
	}
	/**
	 * @return the f2_switch
	 */
	public Integer getF2_switch() {
		return F2_switch;
	}
	/**
	 * @param f2_switch the f2_switch to set
	 */
	public void setF2_switch(Integer f2_switch) {
		F2_switch = f2_switch;
	}
	/**
	 * @return the f3_switch
	 */
	public Integer getF3_switch() {
		return F3_switch;
	}
	/**
	 * @param f3_switch the f3_switch to set
	 */
	public void setF3_switch(Integer f3_switch) {
		F3_switch = f3_switch;
	}
	/**
	 * @return the f4_switch
	 */
	public Integer getF4_switch() {
		return F4_switch;
	}
	/**
	 * @param f4_switch the f4_switch to set
	 */
	public void setF4_switch(Integer f4_switch) {
		F4_switch = f4_switch;
	}
	/**
	 * @return the a1_switch
	 */
	public Integer getA1_switch() {
		return A1_switch;
	}
	/**
	 * @param a1_switch the a1_switch to set
	 */
	public void setA1_switch(Integer a1_switch) {
		A1_switch = a1_switch;
	}
	/**
	 * @return the a1_pattern
	 */
	public Integer getA1_pattern() {
		return A1_pattern;
	}
	/**
	 * @param a1_pattern the a1_pattern to set
	 */
	public void setA1_pattern(Integer a1_pattern) {
		A1_pattern = a1_pattern;
	}
	/**
	 * @return the a1_wind_speed
	 */
	public Integer getA1_wind_speed() {
		return A1_wind_speed;
	}
	/**
	 * @param a1_wind_speed the a1_wind_speed to set
	 */
	public void setA1_wind_speed(Integer a1_wind_speed) {
		A1_wind_speed = a1_wind_speed;
	}
	/**
	 * @return the a1_temperature
	 */
	public Double getA1_temperature() {
		return A1_temperature;
	}
	/**
	 * @param a1_temperature the a1_temperature to set
	 */
	public void setA1_temperature(Double a1_temperature) {
		A1_temperature = a1_temperature;
	}
	/**
	 * @return the a2_switch
	 */
	public Integer getA2_switch() {
		return A2_switch;
	}
	/**
	 * @param a2_switch the a2_switch to set
	 */
	public void setA2_switch(Integer a2_switch) {
		A2_switch = a2_switch;
	}
	/**
	 * @return the a2_pattern
	 */
	public Integer getA2_pattern() {
		return A2_pattern;
	}
	/**
	 * @param a2_pattern the a2_pattern to set
	 */
	public void setA2_pattern(Integer a2_pattern) {
		A2_pattern = a2_pattern;
	}
	/**
	 * @return the a2_wind_speed
	 */
	public Integer getA2_wind_speed() {
		return A2_wind_speed;
	}
	/**
	 * @param a2_wind_speed the a2_wind_speed to set
	 */
	public void setA2_wind_speed(Integer a2_wind_speed) {
		A2_wind_speed = a2_wind_speed;
	}
	/**
	 * @return the a2_temperture
	 */
	public Double getA2_temperature() {
		return A2_temperature;
	}
	/**
	 * @param a2_temperture the a2_temperture to set
	 */
	public void setA2_temperature(Double a2_temperature) {
		A2_temperature = a2_temperature;
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
		return "Command [classroom_Id=" + classroom_id + ", total_switch=" + total_switch + ", L1_switch=" + L1_switch
				+ ", L2_switch=" + L2_switch + ", L3_switch=" + L3_switch + ", L4_switch=" + L4_switch + ", F1_switch="
				+ F1_switch + ", F2_switch=" + F2_switch + ", F3_switch=" + F3_switch + ", F4_switch=" + F4_switch
				+ ", A1_switch=" + A1_switch + ", A1_pattern=" + A1_pattern + ", A1_wind_speed=" + A1_wind_speed
				+ ", A1_temperature=" + A1_temperature + ", A2_switch=" + A2_switch + ", A2_pattern=" + A2_pattern
				+ ", A2_wind_speed=" + A2_wind_speed + ", A2_temperature=" + A2_temperature + "]";
	}
	
	
}
