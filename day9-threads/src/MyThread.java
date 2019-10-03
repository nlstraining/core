
public class MyThread extends Thread {

	
	 public void run(){  // entry point for child threads 
		 
		 for(int i=1;i<=5;i++){
			 
			 System.out.println(this.getName() +":> is running :>" + i);
			 try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
}
