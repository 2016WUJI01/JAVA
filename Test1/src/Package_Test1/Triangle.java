package Package_Test1;

import java.io.*;
import java.util.*;
import java.lang.Math.*;


public class Triangle {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		double a, b, c;
		System.out.println("计算直角三角形斜边的值。");
		System.out.print("请输入直角边a的值：");
		a = reader.nextDouble();
		System.out.print("请输入直角边b的值：");
		b = reader.nextDouble();
		c=Math.sqrt(a*a+b*b);
		System.out.println("该直角三角形斜边c为"+c);

	}
}
