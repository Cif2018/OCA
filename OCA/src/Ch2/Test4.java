package Ch2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import Ch2.Test;

public class Test4 {
	static String food = "milk";
	int i = 0;

	public static void main(String[] args) {
		
		int[][] list= {{1,2},{3},{4,5,6},{}};
		System.out.println(list[3].length);

		List<String> values = new ArrayList<String>();

		String[] AS1 = new String[2]; // OBS: there is no compile err, two null values would return instead
		for (String s : AS1) {
			System.out.println(s);
		}

		String[] AS = { "a", "b", "c" };
//		String s; wrong!
		outer_loop: for (String s : AS) {
			System.out.print(s);
			inner_loop: for (int i = 0; i < 10; i++) {
				if (i > 3) {
					System.out.print("\n");
//					continue inner_loop; //!
//					break inner_loop;
//					break outer_loop;
					continue outer_loop;
				}
				System.out.print(i);
			}
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
