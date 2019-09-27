package day3;

public class Math {

	int a;
//	int a;
	
	
	void add(){
	  int a= 10;
	//  int a = 20;
     int b = 20;
     int c = a+ b;
     System.out.println(c);
	}    
	
	void add(int a, int b){  // one method with different type, number and order of parameters
		
		int c = a + b;
		System.out.println(c);
	}
/*int add(int a, int b){  // one method with different type, number and order of parameters
		
		int c = a + b;
		System.out.println(c);
		return c;
	}*/
	
	void add(short a, int b){  // one method with different type, number and order of parameters
		
		int c = a + b;
		System.out.println(c);
	}
	/*void add(byte a, byte b){  // one method with different type, number and order of parameters
		
		int c = a + b;
		System.out.println(c);
	}*/
	
	void add(double a , double b){
		
		System.out.println(a + b);
	}
}
