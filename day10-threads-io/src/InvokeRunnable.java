
public class InvokeRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunnable r1 = new MyRunnable(new SharedResource());
		Thread t1 = new Thread(r1); // we are telling thread where is the run() method?
		Thread t2 = new Thread(r1);
		 t1.start();
		 t2.start();
	}

}
