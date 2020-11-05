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
		System.out.println("������԰�:");
		System.out.print("�ҵ����ֽ�"+this.getName()+"���ҵĽ���ֵ��"+this.getHealth()+"���Һ����˵����̶ܳ���"+this.getLove());
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
		System.out.println("���ҵ�������"+this.getStrain()+"��");
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
		System.out.println("�����Ա�����"+this.getSex()+"��");
	}
	
}

public class Week8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1;
		int choose1;
		System.out.println("��ӭ�����������");
		System.out.println("������Ҫ��ȡ��������֣�");
		str1 = input.next();
		System.out.println("��ѡ��Ҫ�����ĳ������ͣ���1������ 2����죩");
		choose1 = input.nextInt();
		if(choose1 == 1) {
			System.out.println("��ѡ�񹷵�Ʒ�֣���1����������������Ȯ 2������ѩ����");
			choose1 = input.nextInt();
			
			if(choose1 == 1) {
				Dog pet = new Dog(str1, 100, 20, "��������������Ȯ");
				pet.print();
			} else if(choose1 == 2) {
				Dog pet = new Dog(str1, 100, 20, "����ѩ����");
				pet.print();
			}
		} else if(choose1 == 2) {
			System.out.println("��ѡ�������Ա𣺣�1��Q�� 2��Q�ã�");
			choose1 = input.nextInt();
			if(choose1 == 1) {
				Penguin pet = new Penguin(str1, 100, 20, "��");
				pet.print();
			} else if(choose1 == 2) {
				Penguin pet = new Penguin(str1, 100, 20, "��");
				pet.print();
			}
		}


	}
}
