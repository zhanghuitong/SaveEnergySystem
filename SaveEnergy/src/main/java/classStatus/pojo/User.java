package classStatus.pojo;

import java.io.Serializable;

/**
 * @author 惠通
 *
 */
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String userName;
	private String password;
	private Integer authority;//用户权限
	private Integer userStatus;//用户状态
	private String lastLoginTime;//上次登录时间
	private String currentLoginTime;//当前登录时间
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the authority
	 */
	public Integer getAuthority() {
		return authority;
	}

	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

	/**
	 * @return the userStatus
	 */
	public Integer getUserStatus() {
		return userStatus;
	}

	/**
	 * @param userStatus the userStatus to set
	 */
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	
	
	/**
	 * @return the lastLogingTime
	 */
	public String getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * @param lastLogingTime the lastLogingTime to set
	 */
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * @return the currentLoginTime
	 */
	public String getCurrentLoginTime() {
		return currentLoginTime;
	}

	/**
	 * @param currentLoginTime the currentLoginTime to set
	 */
	public void setCurrentLoginTime(String currentLoginTime) {
		this.currentLoginTime = currentLoginTime;
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
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", authority="
				+ authority + ", userStatus=" + userStatus + ", lastLogingTime=" + lastLoginTime
				+ ", currentLoginTime=" + currentLoginTime + "]";
	}
}
