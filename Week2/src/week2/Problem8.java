package week2;
import java.util.Scanner;
public class Problem8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		//��һ����
		for(int i=1; i<=len ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//�ڶ�����
		for(int i=1; i<=len ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=len-1; i>0 ; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//��������
		for(int i=1; i<=len ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<len ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=len-i ; j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//���Ĳ���
		for(int i=1; i<=len ; i++) {
			for(int j=1; j<=len-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//���岿��
		for(int i=1; i<=len ; i++) {
			for(int j=1; j<=len-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<len ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<(len-i)*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
