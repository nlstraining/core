package threads.interthreadcomm;

public class ThreadFactory {

	public static void main(String[] args) {
	
		Buffer buf = new Buffer(); // where the stock is produced by producer  and stored in Buffer
		
	    
	    
	    Thread prod = new Producer(10, buf);
	    Thread cons = new Consumer(10, buf);
	    
	   
	    prod.start();
	    cons.start();
	    
	    // Wait for the threads to finish
//	    try {
//	    	prod.join();  // college 13527698 Collections Framework
//	    	cons.join();
//	    } catch (InterruptedException e) {return;}
	  }
	 
	}


