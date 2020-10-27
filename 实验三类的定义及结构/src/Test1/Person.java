package Test1;

public class Person {
	private String name;
	private String sex;
	private int age;
	
	public Person(String name) {
		setName(name);
		setSex("m/f");
		setAge(-1);
	}
	
	public Person(String name, String sex, int age) {
		setName(name);
		setSex(sex);
		setAge(age);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setSex(String sex) {
		this.sex=sex;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toPersonString() {
		if(sex=="m/f" && age==-1) {
			return getName();
		} else {
			return getName()+" is "+getAge()+" years old, "+getSex();
		}
	}
	
	public static void main(String[] args) {
		Person person=new Person("Li yi","male",21);
		System.out.println(person.toPersonString());
		Person person1=new Person("ÀîËÄ","m/f",-1);
		System.out.println(person1.toPersonString());
	}
}
