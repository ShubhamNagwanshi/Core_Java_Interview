package practical;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		
		//AutoBoxing
		
		int a = 1;
		Integer b = a;
		
		//primitive data is converted into Object, it is called Auto-boxing.
		
		System.out.println("Wrapper Int: " + b);
		
		
		
		//Unboxing
		
		Integer c = new Integer(15);
		int d = c;
		
		//Unboxing means convert Wrapper class object to primitive type
		
		System.out.println(d);
	}
}