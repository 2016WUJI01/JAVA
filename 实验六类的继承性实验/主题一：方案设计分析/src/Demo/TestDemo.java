package Demo;

class TwoDimensionalShape {
	private int l;
	private int w;
	public TwoDimensionalShape(int l, int w) {
		super();
		this.l = l;
		this.w = w;
	}
	public TwoDimensionalShape() {
		super();
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public void print() {
		System.out.println("����ǣ�"+l*w+"ƽ����");
	}
}

class Rectangle extends TwoDimensionalShape {
	public Rectangle(int l,int w) {
		super(l, w);
	}
	public void print() {
		System.out.println("������");
		super.print();
	}
}

class Square extends TwoDimensionalShape {
	public Square(int l,int w) {
		super(l, w);
	}
	public void print() {
		System.out.println("������");
		super.print();
	}
}

class ThreeDimensionalShape {
	private int h;
	private int l;
	private int w;
	public ThreeDimensionalShape(int h, int l, int w) {
		super();
		this.h = h;
		this.l = l;
		this.w = w;
	}
	public ThreeDimensionalShape() {
		super();
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public void print() {
		System.out.println("����ǣ�"+l*w*h+"������");
	}
}

class Cube extends ThreeDimensionalShape {
	public Cube(int h,int l, int w) {
		super(h, l, w);
	}
	public void print() {
		System.out.println("������");
		super.print();
	}
}

public class TestDemo {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3, 4);
		rectangle.print();
		Square s = new Square(1, 1);
		s.print();
		Cube cube = new Cube(1, 2, 3);
		cube.print();
		
	}
}
