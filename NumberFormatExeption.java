
public class NumberFormatExeption {

	public static void main(String[] args) {
		
		int marks[]=new int[5];
		marks[0]=75;
		marks[1]=56;
		marks[3]=55;
		marks[4]=85;
		
		try {
			System.out.println("inside try block");
			for(int i=0;i<=marks.length;i++) {
				System.out.println("marks "+marks[i]);
			}
			System.out.println("end of try block");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Try within limit");
		}

	}

}
