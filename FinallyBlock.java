
public class FinallyBlock {

	public static void main(String[] args) {
		int num;
		try {
			num=45/5;
			System.out.println("execution of try block");
			System.out.println("the result is "+num);
		}
		catch (ArithmeticException e) {
			System.out.println("exception occured");
		}
		finally {
			System.out.println("execution of finally block");
		}

	}

}
