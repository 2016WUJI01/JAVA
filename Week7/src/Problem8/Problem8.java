package Problem8;


class Phone {
	private String number;
	public Phone(String number) {
		super();
		this.number=number;
	}
	public Phone() {
		super();
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void answer() {
		System.out.println("正在通过电信固网接听电话....");
	}
	public void dial() {
		System.out.println("正在通过电信固网拨打电话....");
	}
	public void show() {
		System.out.println("本机号码是："+this.getNumber());
	}
	
}

class mobilePhone extends Phone {
	private String number;
	public mobilePhone(String number) {
		this.number=number;
	}
	public mobilePhone() {
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void answer() {
		System.out.println("正在通过移动网络接听电话....");
	}
	public void dial() {
		System.out.println("正在通过移动网络拨打电话....");
	}
	public void show() {
		System.out.println("本机号码是："+this.getNumber());
	}
}
class fixPhone extends Phone {
	private String number;
	public fixPhone(String number) {
		this.number=number;
	}
	public fixPhone() {
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void answer() {
		System.out.println("正在通过电信固网接听电话....");
	}
	public void dial() {
		System.out.println("正在通过电信固网拨打电话....");
	}
	public void show() {
		System.out.println("本机号码是："+this.getNumber());
	}
	public void move() {
		System.out.println("正在移动通话....");
	}
}

public class Problem8 {
	public static void main(String[] args) {
		Phone phone1=new Phone("057488222096");
		phone1.show();
		phone1.dial();
		phone1.answer();
		mobilePhone phone2=new mobilePhone("13788886666");
		phone2.show();
		phone2.dial();
		phone2.answer();
		fixPhone phone3=new fixPhone("057488222096");
		phone3.show();
		phone3.dial();
		phone3.answer();
		phone3.move();
	}
}
