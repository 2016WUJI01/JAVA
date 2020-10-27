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
		System.out.print("������"+this.getName()+"\t���䣺"+this.getAge()+"\t\tѧλ"+this.getDegree());
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
		System.out.println("\t\tרҵ��"+this.getSpecialty());
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
		System.out.println("\t\t�о�����"+this.getDirection());
	}
}

public class Problem7 {
	 public static void main(String[] args) {
		 Undergraduate stu1=new Undergraduate("����", 20, "����", "ͨ��");
		 Undergraduate stu2=new Undergraduate("����", 21, "����", "����");
		 graduate stu3=new graduate("����", 25, "˶ʿ", "ͨ��");
		 graduate stu4=new graduate("����", 36, "��ʿ", "ͨ��");
		 stu1.show();
		 stu2.show();
		 stu3.show();
		 stu4.show();
	 }
	 
}
