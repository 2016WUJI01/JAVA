package String2;
import java.util.Scanner;

public class String2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1, str2;
		int count;
		System.out.println("������һ���ַ�����");
		str1 = input.next();
		System.out.println("������Ҫ���ҵ��ַ���");
		str2 = input.next();
		count = counter(str1,str2);
		System.out.println("��"+str1+"���а���"+count+"����"+str2+"����");
		
		
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

