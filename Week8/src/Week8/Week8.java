package Week8;
import java.util.Scanner;

class Pet {
	private String name;
	private int health = 100;
	private int love = 40;
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	public Pet() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public void print() {
		System.out.println("宠物的自白:");
		System.out.print("我的名字叫"+this.getName()+"，我的健康值是"+this.getHealth()+"，我和主人的亲密程度是"+this.getLove());
	}
}

class Dog extends Pet {
	private String strain;
	
	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public void print() {
		super.print();
		System.out.println("，我的类型是"+this.getStrain()+"。");
	}
}

class Penguin extends Pet {
	private String sex;
	
	public Penguin(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void print() {
		super.print();
		System.out.println("，我性别是是"+this.getSex()+"。");
	}
	
}

public class Week8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1;
		int choose1;
		System.out.println("欢迎您来到宠物店");
		System.out.println("请输入要领取宠物的名字：");
		str1 = input.next();
		System.out.println("请选择要领养的宠物类型：（1、狗狗 2、企鹅）");
		choose1 = input.nextInt();
		if(choose1 == 1) {
			System.out.println("请选择狗的品种：（1、聪明的拉布拉多犬 2、酷酷的雪纳瑞）");
			choose1 = input.nextInt();
			
			if(choose1 == 1) {
				Dog pet = new Dog(str1, 100, 20, "聪明的拉布拉多犬");
				pet.print();
			} else if(choose1 == 2) {
				Dog pet = new Dog(str1, 100, 20, "酷酷的雪纳瑞");
				pet.print();
			}
		} else if(choose1 == 2) {
			System.out.println("请选择企鹅的性别：（1、Q仔 2、Q妹）");
			choose1 = input.nextInt();
			if(choose1 == 1) {
				Penguin pet = new Penguin(str1, 100, 20, "雄");
				pet.print();
			} else if(choose1 == 2) {
				Penguin pet = new Penguin(str1, 100, 20, "雌");
				pet.print();
			}
		}


	}
}
