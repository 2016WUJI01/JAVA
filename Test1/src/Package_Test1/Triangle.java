package Package_Test1;

import java.io.*;
import java.util.*;
import java.lang.Math.*;


public class Triangle {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		double a, b, c;
		System.out.println("����ֱ��������б�ߵ�ֵ��");
		System.out.print("������ֱ�Ǳ�a��ֵ��");
		a = reader.nextDouble();
		System.out.print("������ֱ�Ǳ�b��ֵ��");
		b = reader.nextDouble();
		c=Math.sqrt(a*a+b*b);
		System.out.println("��ֱ��������б��cΪ"+c);

	}
}
