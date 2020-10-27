package week2;
import java.util.Scanner;
public class Problem9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		for(int i=0; i<len; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=0; i<len-2; i++) {
			System.out.print("*");
			for(int j=0; j<len-2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int i=0; i<len; i++) {
			System.out.print("*");
		}
	}
}
