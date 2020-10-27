package week2;

public class Problem6 {
	public static void main(String[] args) {
		for(int i=3; i<=10000; i++) {
			int j = i;
			do {
				if(j%2 == 0) {
					j /= 2;
				} else {
					j = j*3+1;
				}
			} while(j != 1);
		}
		System.out.println("Ö¤Ã÷Íê±Ï£¡");
	}
}
