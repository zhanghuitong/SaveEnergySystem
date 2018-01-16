package classStatus.Interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import classStatus.pojo.User;
import classStatus.util.DateTransform;

/**
 * 拦截用户是否有登录
 * @author HT
 *
 */
public class UserInterceptor implements HandlerInterceptor {
	
	
	//执行handlde方法之后,日志
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("afterCompletion.....");
	}
	
	//进入执行Handle,返回ModelAndView之前
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("postHandle.......");

	}
	//Handle方法执行之前
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		//return true表示放行,false表示不放行
		if(user!=null) {
			System.out.println("通过了用户");
			//用户第一次登录是lastLoginTime为空
			String time=DateTransform.trans(new Date());
			user.setCurrentLoginTime(time);
			String lastLoginTime=user.getLastLoginTime();
			if(lastLoginTime!=null) {
				user.setLastLoginTime(user.getCurrentLoginTime());//将上次登录的curruntTime赋给lastLoginTime
			}
			
			return true;
		}else {
			//没有登录的用户,跳转到登录页面
			System.out.println("请求被拦截");
			request.getRequestDispatcher("/login.html").forward(request, response);
			return false;
		}
	}

}
