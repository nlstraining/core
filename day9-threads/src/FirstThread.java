// Concurrency - Multithreading or Threads
// Optimum CPU utilization 
// 1. Multitasking - each process has a separate process address
//   c--> send data to c++ program
//2. Multiuser systems
//3. Multiprocessor  -- multiplecore i5, i7 - Parallel 
//4. Multithreaded systems -- from one main thread we spawn child threads and all these threads run 
// in same process address space
// they don't demand additional memory or resources 
// How speed comes or how speed is delivered by computers?

//1. A thread is an object 
// 2. java.lang.Thread
// 3. we start main and from main we create child threads 

public class FirstThread {

	public static void main(String[] args) {    

		//System.out.println(Thread.currentThread().getName());
		System.out.println("Entred main ........");

		MyThread t1 = new MyThread();
		//MyThread t2 = new MyThread();
		System.out.println("Thread created..............");
         //     t1.run(); we  should not do this
	//	t1.setDaemon(true);
		t1.start();
	//	t2.start();
	
        System.out.println("isDaemon() .... " + t1.isDaemon());
		System.out.println("Child threads started...");
		System.out.println("Exiting main.............");
	}

}
