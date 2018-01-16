package classStatus.pojo;

import java.io.Serializable;

/**
 * @author 惠通
 *
 */
public class ClassStatus  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer classroomId;
	private String classroomName;
	private String ip;
	private Integer connectionStatus;//连接状态
	private Integer totalSwitch;//总开关
	private Integer l1Switch;
	private Integer l2Switch; 
	private Integer l3Switch;
	private Integer l4Switch;
	private Integer f1Switch;
	private Integer f2Switch;
	private Integer f3Switch;
	private Integer f4Switch;
	private Integer a1Switch;
	private Integer a1Pattern;
	private Integer a1WindSpeed;
	private Double a1Temperature;
	private Integer a2Switch;
	private Integer a2Pattern;
	private Integer a2WindSpeed;
	private Double a2Temperature;
	private double temperature;
	private double humidity;
	
	public ClassStatus() {
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
	 * @return the classroomName
	 */
	public String getClassroomName() {
		return classroomName;
	}

	/**
	 * @param classroomName the classroomName to set
	 */
	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the connectionStatus
	 */
	public Integer getConnectionStatus() {
		return connectionStatus;
	}

	/**
	 * @param connectionStatus the connectionStatus to set
	 */
	public void setConnectionStatus(Integer connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	/**
	 * @return the totalSwitch
	 */
	public Integer getTotalSwitch() {
		return totalSwitch;
	}

	/**
	 * @param totalSwitch the totalSwitch to set
	 */
	public void setTotalSwitch(Integer totalSwitch) {
		this.totalSwitch = totalSwitch;
	}

	/**
	 * @return the l1Switch
	 */
	public Integer getL1Switch() {
		return l1Switch;
	}

	/**
	 * @param l1Switch the l1Switch to set
	 */
	public void setL1Switch(Integer l1Switch) {
		this.l1Switch = l1Switch;
	}

	/**
	 * @return the l2Switch
	 */
	public Integer getL2Switch() {
		return l2Switch;
	}

	/**
	 * @param l2Switch the l2Switch to set
	 */
	public void setL2Switch(Integer l2Switch) {
		this.l2Switch = l2Switch;
	}

	/**
	 * @return the l3Switch
	 */
	public Integer getL3Switch() {
		return l3Switch;
	}

	/**
	 * @param l3Switch the l3Switch to set
	 */
	public void setL3Switch(Integer l3Switch) {
		this.l3Switch = l3Switch;
	}

	/**
	 * @return the l4Switch
	 */
	public Integer getL4Switch() {
		return l4Switch;
	}

	/**
	 * @param l4Switch the l4Switch to set
	 */
	public void setL4Switch(Integer l4Switch) {
		this.l4Switch = l4Switch;
	}

	/**
	 * @return the f1Switch
	 */
	public Integer getF1Switch() {
		return f1Switch;
	}

	/**
	 * @param f1Switch the f1Switch to set
	 */
	public void setF1Switch(Integer f1Switch) {
		this.f1Switch = f1Switch;
	}

	/**
	 * @return the f2Switch
	 */
	public Integer getF2Switch() {
		return f2Switch;
	}

	/**
	 * @param f2Switch the f2Switch to set
	 */
	public void setF2Switch(Integer f2Switch) {
		this.f2Switch = f2Switch;
	}

	/**
	 * @return the f3Switch
	 */
	public Integer getF3Switch() {
		return f3Switch;
	}

	/**
	 * @param f3Switch the f3Switch to set
	 */
	public void setF3Switch(Integer f3Switch) {
		this.f3Switch = f3Switch;
	}

	/**
	 * @return the f4Switch
	 */
	public Integer getF4Switch() {
		return f4Switch;
	}

	/**
	 * @param f4Switch the f4Switch to set
	 */
	public void setF4Switch(Integer f4Switch) {
		this.f4Switch = f4Switch;
	}

	/**
	 * @return the a1Switch
	 */
	public Integer getA1Switch() {
		return a1Switch;
	}

	/**
	 * @param a1Switch the a1Switch to set
	 */
	public void setA1Switch(Integer a1Switch) {
		this.a1Switch = a1Switch;
	}

	/**
	 * @return the a1Pattern
	 */
	public Integer getA1Pattern() {
		return a1Pattern;
	}

	/**
	 * @param a1Pattern the a1Pattern to set
	 */
	public void setA1Pattern(Integer a1Pattern) {
		this.a1Pattern = a1Pattern;
	}

	/**
	 * @return the a1Wind_speed
	 */
	public Integer getA1WindSpeed() {
		return a1WindSpeed;
	}

	/**
	 * @param a1Wind_speed the a1Wind_speed to set
	 */
	public void setA1WindSpeed(Integer a1WindSpeed) {
		this.a1WindSpeed = a1WindSpeed;
	}

	/**
	 * @return the a1Temperature
	 */
	public Double getA1Temperature() {
		return a1Temperature;
	}

	/**
	 * @param a1Temperature the a1Temperature to set
	 */
	public void setA1Temperature(Double a1Temperature) {
		this.a1Temperature = a1Temperature;
	}

	/**
	 * @return the a2Switch
	 */
	public Integer getA2Switch() {
		return a2Switch;
	}

	/**
	 * @param a2Switch the a2Switch to set
	 */
	public void setA2Switch(Integer a2Switch) {
		this.a2Switch = a2Switch;
	}

	/**
	 * @return the a2Pattern
	 */
	public Integer getA2Pattern() {
		return a2Pattern;
	}

	/**
	 * @param a2Pattern the a2Pattern to set
	 */
	public void setA2Pattern(Integer a2Pattern) {
		this.a2Pattern = a2Pattern;
	}

	/**
	 * @return the a2WindSpeed
	 */
	public Integer getA2WindSpeed() {
		return a2WindSpeed;
	}

	/**
	 * @param a2WindSpeed the a2WindSpeed to set
	 */
	public void setA2WindSpeed(Integer a2WindSpeed) {
		this.a2WindSpeed = a2WindSpeed;
	}

	/**
	 * @return the a2Temperature
	 */
	public Double getA2Temperature() {
		return a2Temperature;
	}

	/**
	 * @param a2Temperature the a2Temperature to set
	 */
	public void setA2Temperature(Double a2Temperature) {
		this.a2Temperature = a2Temperature;
	}

	/**
	 * @return the temperature
	 */
	public double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the humidity
	 */
	public double getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(double humidity) {
		this.humidity = humidity;
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
		return "ClassStatus [classroomId=" + classroomId + ", classroomName=" + classroomName + ", ip=" + ip
				+ ", connectionStatus=" + connectionStatus + ", totalSwitch=" + totalSwitch + ", l1Switch=" + l1Switch
				+ ", l2Switch=" + l2Switch + ", l3Switch=" + l3Switch + ", l4Switch=" + l4Switch + ", f1Switch="
				+ f1Switch + ", f2Switch=" + f2Switch + ", f3Switch=" + f3Switch + ", f4Switch=" + f4Switch
				+ ", a1Switch=" + a1Switch + ", a1Pattern=" + a1Pattern + ", a1WindSpeed=" + a1WindSpeed
				+ ", a1Temperature=" + a1Temperature + ", a2Switch=" + a2Switch + ", a2Pattern=" + a2Pattern
				+ ", a2WindSpeed=" + a2WindSpeed + ", a2Temperature=" + a2Temperature + ", temperature=" + temperature
				+ ", humidity=" + humidity + "]";
	}

	
	
	
}
	
	
  
