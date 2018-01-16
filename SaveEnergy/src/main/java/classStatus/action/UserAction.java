package classStatus.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import classStatus.pojo.User;
import classStatus.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value="user")
public class UserAction {
	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping(value = "checkAccount")
	public int checkAccount(
			@RequestParam("userName") String userName, 
			@RequestParam("password") String password,
			HttpServletRequest request) {
		User user = this.userServiceImpl.login(userName, password);
		if (user != null) {
			//将user存放到session中
			request.getSession().setAttribute("user", user);
			return 1;
		} else {
			return 0;
		}
	}

	@RequestMapping(value = "login")
	public String login() {
		return "/index.html";
	}
	

	@RequestMapping(value = "checkUserId.do")
	@ResponseBody
	public int  checkUserId(@RequestParam("userId") String userId, HttpServletRequest request) {
		/*if(this.userServiceImpl.checkUserId(userId)==null) {
			System.out.println(this.userServiceImpl.checkUserId(userId));
			System.out.println(1111111);
			return 0;
		}*/
		int result = this.userServiceImpl.checkUserId(userId);
		if (result != 0) {
			System.out.println(userId);
			return 1;// 有该用户Id,返回1
		} else {
			System.out.println(2222222);
			return 0;
		}
	}
	
	@ResponseBody
	@RequestMapping(value="/queryAllUser.do")
	public String queryAllUser() {
		List<User> userList=this.userServiceImpl.queryAllUser();	
		for(User user:userList) {
			System.out.println(user.toString());
		}
		Gson gson =new Gson();
		String userListStr=gson.toJson(userList);
		return userListStr;
	}
	@ResponseBody
	@RequestMapping(value="insertUser.do")
	public int insertUser(
			@RequestParam("userId") String userId,
			@RequestParam("userName") String userName,
			@RequestParam("password") String password, 
			 HttpServletRequest request) {
		User user = new User();
		user.setUserId(userId);
		user.setUserName(userName);
		user.setPassword(password);
		user.setAuthority(1);//权限默认给管理员权限
		user.setUserStatus(1);//状态默认为正常状态
		int result =this.userServiceImpl.insertUser(user);
		if(result!=0) {
			return 1;//注册成功返回1
		}else {
			return 0;
		}
	}

	@RequestMapping(value = "updateUser")
	public int updateUser(@RequestParam("userId") String userId, @RequestParam("userName") String userName,
			@RequestParam("password") String password, @RequestParam("authority") Integer authority,
			@RequestParam("userStatus") Integer userStatus, HttpServletRequest request) {
		User user = new User();
		user.setUserId(userId);
		user.setUserName(userName);
		user.setPassword(password);
		user.setAuthority(authority);
		user.setUserStatus(userStatus);
		
		int result = this.userServiceImpl.updateUserById(user);
		if (result != 0) {
			return 1;// 更新成功返回1
		} else {
			return 0;
		}
	}
	
	/**
	 * 冻结用户账号
	 * @param userId
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="forzenUser.do")
	public Integer forzenUser(
			@RequestParam("userId") String userId
			) {
		int result =this.userServiceImpl.forzenUser(userId);
		if(result==1) {
			return 1;
		}else {
			return 0;
		}
	}
	
  	@RequestMapping(value = "deleteUser")
	public int delteUserById(@RequestParam("userId") String userId, HttpServletRequest request) {
		int result = this.userServiceImpl.deleteUserById(userId);
		if (result != 0) {
			return 1;
		} else {
			return 0;
		}
	}

	@RequestMapping(value = "exit")
	public String exit(HttpServletRequest request) {
		request.getSession().invalidate();// 销毁session退出
		return "/login.jsp";
	}
}
