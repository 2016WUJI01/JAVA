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
				System.out.println("sorry,您猜大了！");
			} else {
				System.out.println("sorry,您猜小了！");
			}
			System.out.println("————请输入您猜的数字：————");
			EnterNum = sc.nextInt();
		}
		System.out.println("恭喜您，猜对了！");
	}
}
