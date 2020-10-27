package String2;
import java.util.Scanner;

public class String2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1, str2;
		int count;
		System.out.println("请输入一个字符串：");
		str1 = input.next();
		System.out.println("请输入要查找的字符：");
		str2 = input.next();
		count = counter(str1,str2);
		System.out.println("“"+str1+"”中包含"+count+"个“"+str2+"”。");
		
		
	}
	
	public static int counter(String str1, String str2) {
		int cnt = 0;
		for(int i=0 ; i<=str1.length()-str2.length() ; i++) {
			if((str1.substring(i, i+str2.length())).equals(str2)) {
				cnt ++;
			}
		}
		return cnt;
	}
}

