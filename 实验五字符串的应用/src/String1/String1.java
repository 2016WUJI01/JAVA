package String1;
import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {
		System.out.println("***��ӭ����ע��ϵͳ***");
		System.out.println();
		Scanner input = new Scanner(System.in);
		String username, password, password1;
		while(true) {
			System.out.println("�������û�����");
			username = input.next();
			System.out.println("���������룺");
			password = input.next();
			System.out.println("���ٴ��������룺");
			password1 = input.next();
			if(username.length()<3 || password.length()<6) {
				System.out.println("�û������Ȳ���С��3�����볤�Ȳ���С��6��");
			} else {
				if(password.equals(password1)) {
					System.out.println("ע��ɹ������μ��û��������롣");
					System.exit(0);
				} else {
					System.out.println("������������벻��ͬ��");
				}
			}
		}
	}
}
