package String1;
import java.util.Scanner;

public class String2 {
	public static void main(String[] args) {
		System.out.println("***��ӭ����ע��ϵͳ***");
		System.out.println();
		Scanner input = new Scanner(System.in);
		String id, phonenum, telenum;
		String[] tele = new String[100];
		while(true) {
			System.out.println("���������֤��");
			id = input.next();
			System.out.println("�������ֻ��ţ�");
			phonenum = input.next();
			System.out.println("�����������ţ�");
			telenum = input.next();
			tele=telenum.split("-");
			if(id.length()==16 || id.length()==18) {
				if(phonenum.length()==11) {
					if(tele[0].length()==4 && tele[1].length()==7) {
						System.out.println("ע��ɹ���");
						System.exit(0);
					} else {
						System.out.println("�����������ű���Ϊ4λ���绰���������7λ��");
					}
				} else {
					System.out.println("�ֻ����������11λ��");
				}
			} else {
				System.out.println("���֤�ű�����16λ��18λ��");
			}
		}
	}
}
