package Test3;

public class ValueTransfer {
	void modify(int i) {
		i++;
	}
	
	void modify(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			arr[i]=1;
		}
	}
	
	void modify(SimpleClass s) {
		s.field=1;
	}
	
	public static void main(String[] args) {
		ValueTransfer v=new ValueTransfer();
		int i=0;
		v.modify(i);
		System.out.println("i="+i);
		int[] intArr=new int[1];
		intArr[0]=100;
		v.modify(intArr);
		System.out.println("intArr[0]="+intArr[0]);
		SimpleClass s=new SimpleClass();
		v.modify(s);
		System.out.println("s.field="+s.field);
	}
}

class SimpleClass {
	int field;
}