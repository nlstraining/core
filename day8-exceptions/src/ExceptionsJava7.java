import java.io.FileInputStream;


public class ExceptionsJava7 {

	public static void main(String[] args) {

		// try with resource
		try(FileInputStream fis = new FileInputStream("")){
			
			
		}
		catch(Exception e ){}
		finally{
			
		}
		
		 try{
			 
			 
		 }catch(NullPointerException | ArithmeticException | IndexOutOfBoundsException e){
			 
			 
		 }

	}

}
