
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = new String("For few dollars more");
		 String  movie ="For few dollars more";  // String literals
		 // 1. strings are ubiquitous in java
		 // 2. new String(); we are relieved from doing this for String instances
		 //3. since there are every where in java, it is obvious, they will repeat 
		 //4. they are memory allocated in string pool on Heap
		 String movie2 = "4 few dollars more";
		 
		 boolean result = movie == movie2;
		 System.out.println(result);
		 System.out.println(movie.equals(m));
		 
		 System.out.println(movie.compareTo(movie2));
		 
		System.out.println(movie.toUpperCase());
		System.out.println(movie=movie.toUpperCase());
		 
		//String   (StringBuffer  a prior| thread safe or synchronized Vs StringBuilder )
		 
		StringBuffer buff = new StringBuffer();
		System.out.println(buff.capacity());
		StringBuilder sbuild = new StringBuilder("hello builder");
		System.out.println(sbuild);
		
		//Wrapper classes - for every primitive class in Java like int - Integer, - Number, Character, Void
		//int i = 10;    // Integer i = new Integer("10");
		String str = "10";
		int i = Integer.parseInt(str);
		System.out.println(i + str); // widening context 
		Integer  rate = new Integer("125");
		
		String s = rate.toString();
	//	---------------------------------------------------------------------------------
		 
		 
	}

}
