package Problem9;

class Worker {
	private String name;
	private String profession;
	private int salary;
	public Worker(String name, String profession, int salary) {
		super();
		this.name = name;
		this.profession = profession;
		this.salary = salary;	
	}
	public Worker() {
		super();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void show() {
		System.out.println("������"+this.getName()+"\t\tְҵ��"+this.getProfession());
	}
	public void showmoney() {
		System.out.println("��н��"+this.getSalary()+"Ԫ/��"+"\tȫ�깤�ʣ�"+this.getSalary()*12+"Ԫ");
	}
}

class Waiter extends Worker {
	public Waiter(String name, String profession, int salary){
		super(name, profession, salary);
	}
	public void show() {
		super.show();
	}
	public void showmoney() {
		super.showmoney();
	}
}

class Teacher extends Worker {
	private int classpay;
	private int classnum;
	public Teacher(String name, String profession, int salary, int classpay, int classnum) {
		super(name, profession, salary);
		this.classpay = classpay;
		this.classnum = classnum;
	}
	public int getClasspay() {
		return classpay;
	}
	public void setClasspay(int classpay) {
		this.classpay = classpay;
	}
	public int getClassnum() {
		return classnum;
	}
	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}
	public void show() {
		super.show();
	}
	public void showmoney() {
		System.out.println("��н��"+this.getSalary()+"Ԫ/��"+"\t�γ꣺"+this.classpay+"Ԫ/��\tȫ�깤�ʣ�"+(this.getSalary()*12+this.getClassnum()*this.getClasspay())+"Ԫ");
	}
}

class Scientist extends Worker {
	private int reward;
	public Scientist(String name, String profession, int salary, int reward) {
		super(name, profession, salary);
		this.reward = reward;
	}
	public int getReward() {
		return reward;
	}
	public void setReward(int reward) {
		this.reward = reward;
	}
	public void show() {
		super.show();
	}
	public void showmoney() {
		System.out.println("��н��"+this.getSalary()+"Ԫ/��"+"\t���м�������"+this.getReward()+"Ԫ/����\tȫ�깤�ʣ�"+(this.getSalary()*12+this.getReward()*4)+"Ԫ");
	}
}

public class Problem9 {
	public static void main(String[] args) {
		Worker people1 = new Worker("����", "����", 4000);
		people1.show();
		people1.showmoney();
		Waiter people2 = new Waiter("����", "����Ա", 3500);
		people2.show();
		people2.showmoney();
		Teacher people3 = new Teacher("����", "��ʦ", 5000, 100, 200);
		people3.show();
		people3.showmoney();
		Scientist people4 = new Scientist("����", "��ѧ��", 7000, 20000);
		people4.show();
		people4.showmoney();
	}
}