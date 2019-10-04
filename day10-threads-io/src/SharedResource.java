
public class SharedResource {
         int i=10;
	 public  synchronized void method1(){
		 //1000       deposit 500 = 1500   
		 // 1000    withdraw 200 = 800               
		 // 1000 + 500 = 1500 ; 1500 - 200 = 1300
		 System.out.println("from method1.." + i++);
	 }
	 
	 public synchronized void method2(){
		 
		 System.out.println("from method2.."+ i--);
	 }
}
