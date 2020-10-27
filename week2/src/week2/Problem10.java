package week2;
import java.util.Scanner;
public class Problem10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len1 = scanner.nextInt();
		int len2 = scanner.nextInt();
		for(int i=1; i<=(len1-len2)/2; i++) {
			for(int j=1; j<=len1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=len2; i++) {
			for(int j=1; j<=(len1-len2)/2; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=len2; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(len1-len2)/2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=(len1-len2)/2; i++) {
			for(int j=1; j<=len1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
