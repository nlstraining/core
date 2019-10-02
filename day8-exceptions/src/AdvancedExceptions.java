import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class AdvancedExceptions {

	static void method() throws FileNotFoundException {
		
		         FileInputStream fis = new FileInputStream("ExceptionsJava7.java"); 
		         
		
	}
	
	
	// catch or rethrow 
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
 
		 method();
		
	}

}
