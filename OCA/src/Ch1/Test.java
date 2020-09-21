package Ch1;

import java.util.Random;

public class Test {

	private int num;
	public int num2;

	/**
	 * @param args details 1 details 2
	 */
	public static void main(String[] args) {
		System.out.println(new Random().nextDouble());
		System.out.println("OK!");
	}

	class Test2 {

		public Test2(Test t) {
			super();
			this.t = t;
		}

		Test t = new Test();

		Test2() {

		}
	}

}
