package day3;

public class UseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		  Math math = new Math();
		  
	      byte b = 10;
		  byte c = 10;
		  math.add(b,c);// same or super   - binding - compile time -- widening 
		
		  long i = 10;
		  long j = 10;
		  math.add( i,j);  //int, int
	}

}
