
public class CountNoOfIntFromString {

	public static void main(String[] args) {
		
		String name = "Shubh123";
		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
		
			if(Character.isDigit(name.charAt(i))){
				count++;
			}
		}
		
		System.out.println("No of int from String :" + count);
	}
}