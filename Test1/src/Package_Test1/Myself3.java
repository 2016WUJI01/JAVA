package Package_Test1;

import javax.swing.JOptionPane;

public class Myself3 {
	public static void main(String args[]) {
		String number, name, sex, age, place;
		number = JOptionPane.showInputDialog("ѧ��?  ");
		name = JOptionPane.showInputDialog("����?  ");
		sex = JOptionPane.showInputDialog("�Ա�?  ");
		age = JOptionPane.showInputDialog("����?  ");
		place = JOptionPane.showInputDialog("����?  ");
		JOptionPane.showMessageDialog(
			null,
			"�ҵ�ѧ����"+number+
			"���ҵ�������"+name+
			"���Ա�"+sex+
			"������:"+age+
			"���ҵĹ�����"+place,
			"Results",
			JOptionPane.PLAIN_MESSAGE );
		System.exit(0);
	}
}
