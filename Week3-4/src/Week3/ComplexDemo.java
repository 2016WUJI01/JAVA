package Week3;

class Complex {
	private int realPart;
	private int imagPart;
	public void setRealPart(int r) {
		this.realPart=r;
	}
	public void setImagPart(int i) {
		this.imagPart=i;
	}
	public int getRealPart() {
		return this.realPart;
	}
	public int getImagPart() {
		return this.realPart;
	}
	public Complex add(Complex b) {
		Complex c=new Complex();
		c.realPart=this.realPart+b.realPart;
		c.imagPart=this.imagPart+b.imagPart;
		return c;
	}
	public Complex sub(Complex b) {
		Complex c=new Complex();
		c.realPart=this.realPart-b.realPart;
		c.imagPart=this.imagPart-b.imagPart;
		return c;
	}
	public void printComplex() {
		System.out.println("该复数的实部为："+this.realPart+"虚部为："+this.imagPart);
	}
}

public class ComplexDemo {
	public static void main(String[] args) {
		Complex a=new Complex();
		Complex b=new Complex();
		Complex c=new Complex();
		a.setRealPart(18);
		a.setImagPart(2);
		b.setRealPart(19);
		b.setImagPart(-13);
		c=a.add(b);
		c.printComplex();
		c=a.sub(b);
		c.printComplex();
	}
}
