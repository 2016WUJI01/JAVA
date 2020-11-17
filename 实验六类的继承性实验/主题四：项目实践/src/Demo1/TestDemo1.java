package Demo1;

interface MyShape {
	public double area();
	public double circum();
}

class MyRectangle implements MyShape {
	private double height;
	private double width;
	public MyRectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	public double area() {
		return height*width;
	}
	public double circum() {
		return 2*(height+width);
	}
}

class MyCircle implements MyShape {
	private double r;
	public MyCircle(double r) {
		this.r = r;
	}
	public double area() {
		return Math.PI*r*r;
	}
	public double circum() {
		return 2*Math.PI*r;
	}
}

class MyTriangle implements MyShape {
	private double a;
	private double b;
	private double c;
	public MyTriangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double area() {
		return Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a))/4;
	}
	public double circum() {
		return a+b+c;
	}
}

public class TestDemo1 {
	public static void main(String[] args) {
		MyShape myShape;
		if(args.length == 1) {
			myShape = new MyCircle(Double.parseDouble(args[0]));
		} else if(args.length == 2) {
			myShape = new MyRectangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
		} else if(args.length == 3) {
			myShape = new MyTriangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
		} else {
			System.out.println("请输入1或2或3个参数");
			return;
		}
		System.out.println("面积是："+myShape.area());
		System.out.println("周长是："+myShape.circum());
	}
}
