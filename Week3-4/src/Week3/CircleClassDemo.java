package Week3;

class Point {
	int x,y;
	
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
	
	public int distance(Point p) {
		int dis=(int)(Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)));
		return dis;
	}
}

class Circle {
	Point p0,p1;
	
	public Point getP0() {
		return p0;
	}
	
	public void setP0(Point p0) {
		this.p0 = p0;
	}
	
	public Point getP1() {
		return p1;
	}
	
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	
	public int area() {
		int a1=(int)(Math.PI*p0.distance(p1)*p0.distance(p1));
		return a1;
	}
	
}

public class CircleClassDemo {
	public static void main(String[] args) {
		Point p0=new Point();
		Point p1=new Point();
		p0.setX(0);
		p0.setY(0);
		p1.setX(12);
		p1.setY(4);
		Circle c1=new Circle();
		c1.setP0(p0);
		c1.setP1(p1);
		System.out.println("c1的圆心为："+p0.x+","+p0.y);
		System.out.println("c1圆上一点为："+p1.x+","+p1.y);
		System.out.println("c1圆的面积为："+c1.area());
	}
}
