package Week3;

class Pointt {
	int x, y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}

class Rectangle {
	Pointt p0, p1;
	public Pointt getP0() {
		return p0;
	}
	
	public void setP0(Pointt p0) {
		this.p0 = p0;
	}
	
	public Pointt getP1() {
		return p1;
	}
	
	public void setP1(Pointt p1) {
		this.p1 = p1;
	}
	
	public int area() {
		int a1=(int)(Math.abs(p0.x-p1.x)*(Math.abs(p0.y-p1.y)));
		return a1;
	}
}

public class RectangleClass {
	public static void main(String[] args) {
		Pointt p0=new Pointt();
		Pointt p1=new Pointt();
		p0.setX(0);
		p0.setY(0);
		p1.setX(5);
		p1.setY(-5);
		Rectangle r1=new Rectangle();
		r1.setP0(p0);
		r1.setP1(p1);
		System.out.println("Ãæ»ýÎª£º"+r1.area());
	}
}
