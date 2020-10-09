package Ch2;

import static java.lang.System.out;

public class Test {

	public static void main(String[] args) {
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

		int q = 2;
		int qq = 3;
		q *= qq;
		out.println(q);

	}

}
