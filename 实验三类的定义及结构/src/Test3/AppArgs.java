package Test3;

public class AppArgs {
	public static void main(String[] args) {
		int[] a= {8,3,7,88,9,23};
		LeastNumb a1=new LeastNumb();
		a1.least(a);
	}

}

class LeastNumb {
	public void least(int[] array) {
		int temp=array[0];
		for(int i=1; i<array.length ; i++) {
			if(temp>array[i]) {
				temp=array[i];
			}
		}
		System.out.println(temp);
	}
}