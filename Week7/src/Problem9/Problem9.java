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
		System.out.println("姓名："+this.getName()+"\t\t职业："+this.getProfession());
	}
	public void showmoney() {
		System.out.println("月薪："+this.getSalary()+"元/月"+"\t全年工资："+this.getSalary()*12+"元");
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
		System.out.println("月薪："+this.getSalary()+"元/月"+"\t课酬："+this.classpay+"元/节\t全年工资："+(this.getSalary()*12+this.getClassnum()*this.getClasspay())+"元");
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
		System.out.println("月薪："+this.getSalary()+"元/月"+"\t科研激励奖："+this.getReward()+"元/季度\t全年工资："+(this.getSalary()*12+this.getReward()*4)+"元");
	}
}

public class Problem9 {
	public static void main(String[] args) {
		Worker people1 = new Worker("张三", "工人", 4000);
		people1.show();
		people1.showmoney();
		Waiter people2 = new Waiter("李四", "服务员", 3500);
		people2.show();
		people2.showmoney();
		Teacher people3 = new Teacher("王五", "老师", 5000, 100, 200);
		people3.show();
		people3.showmoney();
		Scientist people4 = new Scientist("刘六", "科学家", 7000, 20000);
		people4.show();
		people4.showmoney();
	}
}