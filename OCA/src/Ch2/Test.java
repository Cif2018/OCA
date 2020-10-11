package Ch2;

import static java.lang.System.out;

class Test2{
	
}

class Test3{
	
}

public class Test {

	public static void main(String[] args) {
		
		Test2 t=new Test2();
		out.println(t instanceof Test2);
		
//		String s = "ok";
//		s += 2;
//		s=s+2;
//		out.println(s);

		out.println(3 % 2);
		out.println(-3 % 2);

		out.println(9 / 2);
		out.println(9.0 / 2);

		int x = 3;
		int y = ++x * 5 / x-- + --x;
		out.println("x=" + x);
		out.println("y=" + y);

		short z = (short) 1_921_222;

		out.println(z);
		out.println(Short.MIN_VALUE);
		out.println(Short.MAX_VALUE);

		long x1 = 2;
		int y1 = 3;
		y1 *= x1;
//		y1=(y1*x1);
//		y1=(int) (y1*x1);
		out.println(y1);

		long x2=3;
		long y2=(x2=2)+1;
		out.println(x2);
		out.println(y2);

	}

}
