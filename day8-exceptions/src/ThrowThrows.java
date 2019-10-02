
public class ThrowThrows {

	// throw is a jump statement like : return, break, continue : 
	// throws is a clause - an additional superimposing condition for calling a method
	static void m() throws Exception{
		
		if( 10 < 20)
			throw new Exception("10 is less than 20 ");
		
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             try {
				m();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
