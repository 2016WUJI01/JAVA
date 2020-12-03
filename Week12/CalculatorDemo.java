package CalculatorDemo;

import java.awt.*;
import javax.swing.*;

public class CalculatorDemo {
	public static void main(String[] args) {
		//��������
		final JFrame jf = new JFrame("������");
		jf.setLayout(new FlowLayout(1, 5, 5));
		jf.setSize(300, 300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setResizable(false);
		
		//��Ϊ��������
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(new GridLayout(4, 4, 1, 1));
		
		//��һ������������ֿ�
		JTextArea text = new JTextArea(1, 13);
		text.setFont(new Font(null, Font.PLAIN, 20));
		text.setPreferredSize(new Dimension(190, 30));
		text.setEditable(false);
		panel1.add(text);
		
		//��һ�������Ҳ���տ�
		JButton buttonC = new JButton("C");
		buttonC.setFont(new Font(null, Font.PLAIN, 20));
		buttonC.setPreferredSize(new Dimension(55, 35));
		panel1.add(buttonC);
		
		//������+-*/=��
		String button_str[] = {"1", "2", "3", "/", "4", "5", "6", "*", "7", "8", "9", "-", "0", ".", "=", "+"};
		JButton button[] = new JButton[button_str.length];
		for(int i = 0 ; i < button_str.length ; i++) {
			button[i] = new JButton(button_str[i]);
			button[i].setFont(new Font(null, Font.PLAIN, 20));
			button[i].setPreferredSize(new Dimension(68, 50));
			panel2.add(button[i]);
		}
		
		//��ʾ��������
		jf.getContentPane().add(panel1, BorderLayout.NORTH);
		jf.getContentPane().add(panel2, BorderLayout.CENTER);
		jf.setVisible(true);
	}
}
