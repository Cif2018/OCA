package Ch2;

import java.io.File;

import Ch2.Test;

public class Test4 {

	public static void main(String[] args) {
		String s;
		System.out.println(s=((1>2)?"T":"F"));
		boolean b=false;
if (b) 
	System.out.println("TRUE");
else 
	System.out.println("FALSE");
		
		Test t = new Test();
		System.out.println(t.toString());

		File x = new File("myFile.txt");
		File y = new File("myFile.txt");

		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		
		System.out.println(x.equals(y));

	}

}
