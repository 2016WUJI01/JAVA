package Test3;
import java.awt.Container;
import javax.swing.*;

public class PassArray extends JApplet{
	JTextArea outputArea;
	String output;
	public void init() {
		outputArea=new JTextArea();
		Container c=getContentPane();
		c.add(outputArea);
		int a[]= {1,2,3,4,5};
		output="Effects of passing entire"+"array call-by-reference:\n"+"The Values of the original array are:\n";
		for(int i=0; i<a.length ; i++) {
			output+=" "+a[i];
		}
		modifyArray(a);
		output+="\n\nThe values of the dodified array are:\n";
		for(int i=0 ; i<a.length ; i++) {
			output+=" "+a[i];
		}
		output+="\n\nEffects fo passing array"+"element call-by-value:\n"+"a[3] before modifyElement:"+a[3];
		modifyElement(a[3]);
		output+="\na[3] after modifyElement:"+a[3];
		outputArea.setText(output);
	}
	
	public void modifyArray(int b[]) {
		for(int j=0 ; j<b.length ; j++) {
			b[j]*=2;
		}
	}
	public void modifyElement(int e) {
		e*=2;
	}
}
