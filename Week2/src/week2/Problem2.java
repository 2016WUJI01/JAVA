package week2;

public class Problem2 {
	public static void main(String[] args) {
		int b[][] = new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				b[i][j]=i*j;
			}
		}
		System.out.println(b[2][3]);
	}
}
