package Ch2;

import java.io.File;

import Ch2.Test;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		System.out.println(t.toString());

		File x = new File("myFile.txt");
		File y = new File("myFile.txt");

		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		
		System.out.println(x.equals(y));

	}

}
