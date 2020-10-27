package Problem7;

class Student {
	private String name;
	private int age;
	private String degree;
	
	public Student(String name, int age, String degree) {
		super();
		this.name = name;
		this.age = age;
		this.degree = degree;
	}
	public Student() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public void show() {
		System.out.print("姓名："+this.getName()+"\t年龄："+this.getAge()+"\t\t学位"+this.getDegree());
	}
}

class Undergraduate extends Student {
	private String specialty;
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	public Undergraduate(String name, int age, String degree, String specialty) {
		super(name, age, degree);
		this.specialty = specialty;
	}
	
	public void show() {
		super.show();
		System.out.println("\t\t专业："+this.getSpecialty());
	}
}

class graduate extends Student {
	private String direction;
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public graduate(String name, int age, String degree, String direction) {
		super(name, age, degree);
		this.direction = direction;
	}
	
	public void show() {
		super.show();
		System.out.println("\t\t研究方向："+this.getDirection());
	}
}

public class Problem7 {
	 public static void main(String[] args) {
		 Undergraduate stu1=new Undergraduate("张三", 20, "本科", "通信");
		 Undergraduate stu2=new Undergraduate("李四", 21, "本科", "电子");
		 graduate stu3=new graduate("王五", 25, "硕士", "通信");
		 graduate stu4=new graduate("刘六", 36, "博士", "通信");
		 stu1.show();
		 stu2.show();
		 stu3.show();
		 stu4.show();
	 }
	 
}
