package Ch2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import Ch2.Test;

public class Test4 {
	static String food = "milk";
	int i = 0;

	public static void main(String[] args) {
		
		List<String> values = new ArrayList<String>();
		
		String[] AS1=new String[2]; //OBS: there is no compile err, two null values would return instead
		for (String s:AS1) {
			System.out.println(s);
		}
		
		String[] AS= {"x1","x2","x3"};
//		String s; wrong!
		for (String s:AS) {
			System.out.println(s);
		}
				
		int i;
		int j;
		for (i = 0, j = 0; i < 10; i++, j++) {
			System.out.print(i);
			System.out.println(j);
		}

//		for (int i = 0, j = 0; i < 10; i++, j++) {
//			System.out.print(i);
//			System.out.println(j);
//		}

		someFood someFoodVar = someFood.BREAD;
		switch (someFoodVar) {
		case BREAD:
			System.out.println("enum BREAD here");
			break;
		}

		System.out.println(someFood.valueOf("MILK"));

//		final String milk = "milk";
//		switch (Test4.food) {
//		case milk:
//			System.out.println("milk");
////			break;
//			System.out.println("milk");
////			break;
//		default:
//			System.out.println("other");
//		}

//		String s;
//		System.out.println(s=((1>2)?"T":"F"));
//		boolean b=false;
//if (b) 
//	System.out.println("TRUE");
//else 
//	System.out.println("FALSE");
//		
//		Test t = new Test();
//		System.out.println(t.toString());
//
//		File x = new File("myFile.txt");
//		File y = new File("myFile.txt");
//
//		System.out.println(x.hashCode());
//		System.out.println(y.hashCode());
//		
//		System.out.println(x.equals(y));

	}

	public enum someFood {
		BREAD, MILK, WATER
	}

}
