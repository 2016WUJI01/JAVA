package String1;
import java.util.Scanner;

public class String2 {
	public static void main(String[] args) {
		System.out.println("***欢迎进入注册系统***");
		System.out.println();
		Scanner input = new Scanner(System.in);
		String id, phonenum, telenum;
		String[] tele = new String[100];
		while(true) {
			System.out.println("请输入身份证：");
			id = input.next();
			System.out.println("请输入手机号：");
			phonenum = input.next();
			System.out.println("请输入座机号：");
			telenum = input.next();
			tele=telenum.split("-");
			if(id.length()==16 || id.length()==18) {
				if(phonenum.length()==11) {
					if(tele[0].length()==4 && tele[1].length()==7) {
						System.out.println("注册成功！");
						System.exit(0);
					} else {
						System.out.println("座机号码区号必须为4位，电话号码必须是7位！");
					}
				} else {
					System.out.println("手机号码必须是11位！");
				}
			} else {
				System.out.println("身份证号必须是16位或18位！");
			}
		}
	}
}
