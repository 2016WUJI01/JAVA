package week2;
import java.util.Random;
import java.util.Scanner;
public class Problem12 {
	public static void main(String[] args) {
		int RandNum = new Random().nextInt(10);
		Scanner sc = new Scanner(System.in);
		int EnterNum = sc.nextInt();
		while(EnterNum != RandNum) {
			if(EnterNum > RandNum) {
				System.out.println("sorry,���´��ˣ�");
			} else {
				System.out.println("sorry,����С�ˣ�");
			}
			System.out.println("�����������������µ����֣���������");
			EnterNum = sc.nextInt();
		}
		System.out.println("��ϲ�����¶��ˣ�");
	}
}
