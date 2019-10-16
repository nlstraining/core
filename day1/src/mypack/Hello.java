// comment
package mypack ; // 0 or 1
//import   0 or  * 
// 0 or more classes 
 class Welcome {}
//interfaces, enums 
public class Hello {

	public static void main(String[] args) {
		
		System.out.printf("%s","Welcome to Java");
		
       byte b = 10;
       final int i = -10; // const it is reserved
       b= i;
	    //i=34567;
		//b=i;
	
       boolean flag = true; // false
       
       boolean result = flag == false;
       
       // two types - 1) primitive types 2) reference types 
       
       // primitive types 8 - 7 numeric and 1 boolean 
       
       //7 numeric - 6 are sigined 1 unsigned (char = 2 bytes )
     //  (byte =1, short = 2, int = 4, long = 8, float = 4, double 8 (double precision) )
       // signed long int, signed long long unsigned short long
       
       // 6 signed 4 integer and 2 real ( float and double) 
       
      // char c = 'a';
   //    short s = c;
       
       int  j = 23;
       double d = 34.456;
    //   float f = j + d; // widened
  
       short k = 45;
        b = 45;
       long l  = k + b + j;
       
       d = d+ b + k;
	
	}

}
