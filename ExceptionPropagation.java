
public class ExceptionPropagation {

	void exception1(){
		int num=10/0;
	}
	void exception2() {
		exception1();
		
	}
	void exception3() {
		try {
			exception2();
		}catch (Exception e) {
			System.out.println("exception caught");
		}
		}
	public static void main(String[] args) {
		
		ExceptionPropagation ep=new ExceptionPropagation();
		ep.exception3();
		System.out.println();
		System.out.println("exception propagated");
	}
	
}
