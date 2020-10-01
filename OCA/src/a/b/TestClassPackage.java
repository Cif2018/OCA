package a.b;

import static java.lang.System.out;

public class TestClassPackage {

	public static int suma(int a, int b) {
		int x;
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClassPackage tcp = new TestClassPackage();
		out.println("inside main");
		int i = 10_00;
		out.println(i + 1);
		out.println(suma(1, 3));
	}

	{
		out.println("bloc initializat la instantiere...1");
	}
	{
		out.println("bloc initializat la instantiere...2");
	}

}
