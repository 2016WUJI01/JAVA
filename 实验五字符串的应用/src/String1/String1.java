package String1;
import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {
		System.out.println("***欢迎进入注册系统***");
		System.out.println();
		Scanner input = new Scanner(System.in);
		String username, password, password1;
		while(true) {
			System.out.println("请输入用户名：");
			username = input.next();
			System.out.println("请输入密码：");
			password = input.next();
			System.out.println("请再次输入密码：");
			password1 = input.next();
			if(username.length()<3 || password.length()<6) {
				System.out.println("用户名长度不能小于3，密码长度不能小于6！");
			} else {
				if(password.equals(password1)) {
					System.out.println("注册成功！请牢记用户名和密码。");
					System.exit(0);
				} else {
					System.out.println("两次输入的密码不相同！");
				}
			}
		}
	}
}
