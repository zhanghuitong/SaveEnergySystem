package classStatus.pojo;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String log_id;
	private Integer classroom_id;
	private String operacte_device;
	private String status;
	private String operaction_time;
	private String remark;

	public Log() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the log_id
	 */
	public String getLog_id() {
		return log_id;
	}

	/**
	 * @param log_id
	 *            the log_id to set
	 */
	public void setLog_id(String log_id) {
		this.log_id = log_id;
	}

	/**
	 * @return the classroom_id
	 */
	public Integer getClassroom_id() {
		return classroom_id;
	}

	/**
	 * @param classroom_id
	 *            the classroom_id to set
	 */
	public void setClassroom_id(Integer classroom_id) {
		this.classroom_id = classroom_id;
	}

	/**
	 * @return the operacte_device
	 */
	public String getOperacte_device() {
		return operacte_device;
	}

	/**
	 * @param operacte_device
	 *            the operacte_device to set
	 */
	public void setOperacte_device(String operacte_device) {
		this.operacte_device = operacte_device;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the operaction_time
	 */
	public String getOperaction_time() {
		return operaction_time;
	}

	/**
	 * @param operaction_time
	 *            the operaction_time to set
	 */
	public void setOperaction_time(String operaction_time) {
		this.operaction_time = operaction_time;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Log [log_id=" + log_id + ", classroom_id=" + classroom_id + ", operacte_device=" + operacte_device
				+ ", status=" + status + ", operaction_time=" + operaction_time + ", remark=" + remark + "]";
	}

}
