package pratical;

public class TryWithMultiCatchFinally {

	public static void main(String[] args) {

		String s = null;

		try {
			System.out.println(s.length());
			System.out.println(s.charAt(5));

		} catch (NullPointerException e) {
			System.out.println(e);
//			System.exit(0);

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println(e);
//			System.exit(0);

		} catch (RuntimeException e) {
			System.out.println(e);
			System.exit(0);
		} finally {
//			System.exit(0);

			System.out.println("this is Finally block");
		}
	}
}