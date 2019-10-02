// 1. marks the program for termination
//2. creates an instance of that ExceptionClass
// 3. it searches for an handler (try/catch block)
// if handler is found, initialize the handler   - the program exits gracefully and we have an 
// opportunity to log the exception context
//                 else throw the exception and stop the program - exits abruptly
public class RuntimeExample {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
            //throw new Exception();
			int c = a / b;

		//	System.out.println(c);

		}
		/*
		catch (NullPointerException ref) {
			ref.printStackTrace();
		} catch (ArithmeticException ref) {

			ref.printStackTrace();
		} catch (IllegalArgumentException ref) {

			ref.printStackTrace();
		}catch(RuntimeException e){
			
			// default in switch case ?
		}
		catch(Exception e){
			
			e.printStackTrace();
		}catch(Throwable t){
			
			t.getCause();
		}*/finally{
			 // close or release locks and resources 
			 System.out.println("it is always executed in good times and in bad times");
		}
		
		System.out.println("after computational mess..... ");
	}

}
