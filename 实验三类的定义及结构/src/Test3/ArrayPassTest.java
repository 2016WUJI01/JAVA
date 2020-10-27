package Test3;

class ArrayPass {
	public int searchMin(double[] number) {
		int indexOfMin=0;
		for(int i=1;i<number.length;i++) {
			if(number[i]<number[indexOfMin]) {
				indexOfMin=i;
			}
		}
		return indexOfMin;
	}
}

public class ArrayPassTest {
	public static void main(String args[]) {
		ArrayPass a=new ArrayPass();
		double [] arrayOne= {3.3, 7.5, 9.2, 10.3, 19.3};
		int minOne=a.searchMin(arrayOne);
		System.out.println("数组arrayOne的最小值是"+arrayOne[minOne]);
	}
}
