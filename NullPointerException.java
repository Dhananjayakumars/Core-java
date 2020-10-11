
public class NullPointerException {

	public static void main (String[] args)     { 
        // String set to null
        String myStr = null; 
          // Checking if myStr is null using try catch. 
        try   { 
             myStr=null;    
                System.out.print("Two strings are same"); 
            } 
        catch (NullPointerException e) {
			// TODO: handle exception
		} {
			 System.out.print("Caught NullPointerException"); 
        } 
	}
}

    


		
		
	
	
	
	