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
		System.out.println("����ͨ�����Ź��������绰....");
	}
	public void dial() {
		System.out.println("����ͨ�����Ź�������绰....");
	}
	public void show() {
		System.out.println("���������ǣ�"+this.getNumber());
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
		System.out.println("����ͨ���ƶ���������绰....");
	}
	public void dial() {
		System.out.println("����ͨ���ƶ����粦��绰....");
	}
	public void show() {
		System.out.println("���������ǣ�"+this.getNumber());
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
		System.out.println("����ͨ�����Ź��������绰....");
	}
	public void dial() {
		System.out.println("����ͨ�����Ź�������绰....");
	}
	public void show() {
		System.out.println("���������ǣ�"+this.getNumber());
	}
	public void move() {
		System.out.println("�����ƶ�ͨ��....");
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
