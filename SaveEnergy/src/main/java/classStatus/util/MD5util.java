package classStatus.util;
import java.math.BigInteger;
import java.security.MessageDigest;

public class MD5util {
	public MD5util() {
		// TODO Auto-generated constructor stub
	}
	public static String getMD5(String password){
		try{
			//生成一个加密计算摘要
			MessageDigest md=MessageDigest.getInstance("MD5");
			//计算MD5函数
			md.update(password.getBytes());
			//  // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
	        // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
			return new BigInteger(1,md.digest()).toString(16);
		}catch(Exception e){
			System.out.println("MD5加密出错");
		}
		return password;
	}
	
}