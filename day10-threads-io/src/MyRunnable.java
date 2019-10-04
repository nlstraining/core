// extend or implements
// GUI you must extend JFrame  
// You all ready inherit some class, then implement interface 
// all games have window + multi threading 
public class MyRunnable implements Runnable {
	SharedResource sr;
	
	
public MyRunnable(SharedResource sr) {

	this.sr = sr;
}
	
	
	@Override
	public void run() {
for(int i =1;i <=5; i++){
			 if(Thread.currentThread().getName().equals("Thread-1"))
				  sr.method1();
			 else
				 sr.method2();
			System.out.println(Thread.currentThread().getName() + i);
		}
	
	}

}
