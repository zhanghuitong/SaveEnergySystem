package classStatus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import classStatus.dao.UserMapper;
import classStatus.pojo.User;
import classStatus.service.UserService;
import classStatus.util.MD5util;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	public User queryUserById(String id) {
		return this.userMapper.queryUserById(id);
	}

	public List<User> queryAllUser() {
		return this.userMapper.queryAllUser();
	}

	public int insertUser(User user) {
		//MD5加密密码
		String password=user.getPassword();
		String encodePwd=MD5util.getMD5(password);
		user.setPassword(encodePwd);
		return this.userMapper.insertUser(user);
	}

	public int updateUserById(User user) {
		return this.userMapper.updateUserById(user);
	}

	public int deleteUserById(String userId) {
		return this.userMapper.deleteUserById(userId);
	}

	public User login(String userName, String password) {
		String encodePsw=MD5util.getMD5(password);
		return this.userMapper.login(userName, encodePsw);
	}

	public int checkUserId(String userId) {
		return this.userMapper.checkUserId(userId);
	}

	@Override
	public int forzenUser(String userId) {
		return this.userMapper.forzenUser(userId);
	}

}
