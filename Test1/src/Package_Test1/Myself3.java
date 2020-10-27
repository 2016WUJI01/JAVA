package Package_Test1;

import javax.swing.JOptionPane;

public class Myself3 {
	public static void main(String args[]) {
		String number, name, sex, age, place;
		number = JOptionPane.showInputDialog("学号?  ");
		name = JOptionPane.showInputDialog("姓名?  ");
		sex = JOptionPane.showInputDialog("性别?  ");
		age = JOptionPane.showInputDialog("年龄?  ");
		place = JOptionPane.showInputDialog("故乡?  ");
		JOptionPane.showMessageDialog(
			null,
			"我的学号是"+number+
			"，我的姓名是"+name+
			"，性别："+sex+
			"，年龄:"+age+
			"，我的故乡是"+place,
			"Results",
			JOptionPane.PLAIN_MESSAGE );
		System.exit(0);
	}
}
