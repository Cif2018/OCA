package a.b;

import static java.lang.System.out;

class notPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
out.println("not public class");

new notPublic();

class innerClass2{}

new innerClass2();

	}
	
	
	{innerClass ic=new innerClass();
	
//	new innerClass2(); error: innerClass2 cannot be resolved to a type
	
	}
	
	class innerClass{

//		public innerClass() {
//			super();
//			// TODO Auto-generated constructor stub
//		}
		
		
		public innerClass(){
			out.println("from innerClass constructor!");
		}
	}

}
