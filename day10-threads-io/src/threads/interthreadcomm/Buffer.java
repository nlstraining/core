package threads.interthreadcomm;

public class Buffer {
	private int contents;
		private boolean empty = true;
		
		public synchronized void put (int i) throws InterruptedException { 
			while (empty == false) { 	//wait till the buffer becomes empty
				try { wait(); } // is defined in Object class
				catch (InterruptedException e) {throw e;}
			}
			contents = i;
			empty = false;
			System.out.println("Producer: put..." + i);
			notify();
		} 
		
		public synchronized int get () throws InterruptedException {
			while (empty == true)  {	//wait till something appears in the buffer
				try { 	wait(); }
				catch (InterruptedException e) {throw e;}
			}
			empty = true;
			notify();
			int val = contents;
			System.out.println("Consumer: got..." + val);
			return val;
		}
}
