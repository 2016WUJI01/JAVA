package week2;
import java.util.Random;
public class Problem7 {
	public static void main(String[] args) {
		int[] ans = new int[13];
		for(int i=0 ; i<3600 ; i++ ) {
			int a = new Random().nextInt(6)+1;
			int b = new Random().nextInt(6)+1;
			ans[a+b]++;
		}
		for(int i=2; i<=12; i++) {
			System.out.println("和为"+i+"的数量"+ans[i]);
		}
	}
}
