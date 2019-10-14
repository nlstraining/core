

public class TestLambdas {

	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//	MyRunnable r = new MyRunnable();
		Thread t = new Thread(new Runnable(){
			           public void run(){
			      
			        	   for(int i=0;i<10;i++){
			        		   
			        		   System.out.println("in run .... ");
			        	   }
			           }
		});
		//t.start();
		//@FunctionalInterface 
		Runnable r = () ->{
			
			   for(int i=0;i<10;i++){
        		   
        		   System.out.println("in run ....as lamb ");
        	   }
		};
	Thread t2 = new Thread(r);
		t2.start();

	}

}
