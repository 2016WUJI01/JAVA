package Package_Test1;

public class PrintDemo {
	public static void main(String args[]) {
		Object o="an example";
		char c[]={'a','b','c','d','e'};
		byte b[]={'f','g','h','i','j'};
		
		System.out.println(true);
		System.out.println("c");
		System.out.println(100);
		System.out.println(200000L);
		System.out.println(13.6);
		System.out.println(2346.99D);
		System.out.println("a student");
		System.out.println(o);
		System.out.println(c);
		System.out.write(b,0,2);
		System.out.println();
		System.out.write(b,0,1);
		System.out.flush();
	}
}
