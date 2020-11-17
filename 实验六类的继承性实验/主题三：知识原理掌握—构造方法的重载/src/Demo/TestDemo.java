package Demo;

class Person {
	private String name;
	private String addr;
	private String sex;
	private int age;
	public Person(String name, String addr, String sex, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.sex = sex;
		this.age = age;
	}
	public Person(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show() {
		System.out.println("名字是："+this.getName()+"\t地址是："+this.getAddr()+"\t性别是："+this.getSex()+"\t年龄是："+this.getAge());
	}
}

class Student extends Person {
	private int math;
	private int english;
	public Student(String name, String addr, String sex, int age, int math, int english) {
		super(name, addr, sex, age);
		this.math = math;
		this.english = english;
	}
	public Student(String name, String addr) {
		super(name, addr);
	}
	public Student() {
		super();
	}
	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public void show() {
		System.out.println("名字是："+this.getName()+"\t地址是："+this.getAddr()+"\t性别是："+this.getSex()+"\t年龄是："+this.getAge()+"\t数学成绩是："+this.getMath()+"\t英语成绩是："+this.getEnglish());
	}
}

public class TestDemo {
	public static void main(String[] args) {
		Person person = new Person("name", "address", "sex", 18);
		person.show();
		Student student = new Student("student", "school", "sex", 19, 80, 60);
		student.show();
	}
}
