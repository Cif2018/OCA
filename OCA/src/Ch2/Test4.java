package Ch2;

import java.io.File;

import Ch2.Test;

public class Test4 {
	static String food = "milk";

	public static void main(String[] args) {
//		int i=0;
		for (int i=0,j=0;i<10;i++,j++){
			System.out.print(i);
			System.out.println(j);
		}
		
		someFood someFoodVar =someFood.BREAD;
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
	
	public enum someFood{
		BREAD,MILK,WATER
	}
	


}
