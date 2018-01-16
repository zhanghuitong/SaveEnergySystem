package classStatus.dao;

import java.util.List;

import classStatus.pojo.User;

public interface UserMapper {
	/**
	 * 按照id查找用户
	 * @param id
	 * @return
	 */
	User queryUserById(String id);
	
	/**
	 * 查询所有User
	 * @return
	 */
	List<User> queryAllUser();
	
	/**
	 * 添加User记录
	 * @param User
	 * @return
	 */
	int insertUser(User user);
	
	/**
	 * 更新user记录
	 * @param user
	 * @return
	 */
	int updateUserById(User user);
	
	/**
	 * 冻结user
	 * @param id
	 * @return
	 */
	int deleteUserById(String userId);
	
	/**
	 * 登录
	 * @param userName
	 * @param password
	 * @return
	 */
	User login(String userName,String password);
	
	/**
	 * 查询用户id是否存在
	 * @param userId
	 * @return
	 */
	int checkUserId(String userId);
	
	/**
	 * 冻结账户
	 * @param userId
	 * @return
	 */
	int forzenUser(String userId);
	
	/**
	 * 获取上一次登录时间
	 * @return
	 */
	String queryLastLoginTime();
	
	/**
	 * 本次登录时间
	 * @param currentTime
	 * @return
	 */
	String insertCurrentLoginTime(String currentTime);
}
