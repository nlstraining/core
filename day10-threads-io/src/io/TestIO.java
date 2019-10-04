package io;

import java.io.*;
// IO = Input output = all classes are divided into two categories 
// abstraction of input? -  read
// output ?    write 
//is from programmers perspective or application perspective?
// from where all a program gets input???
  //1. key board 2. Files 3. Networks (Cloud+internet = sockets) 4. Database
//1. VDU - monitor or printer 2. Files 3. Networks 4. Database
// System view = Input --> process --> output 
//  Abstract classes
//   byte streams and character streams 
public class TestIO {

	public static void main(String[] args) throws IOException {
	
      /*       InputStream is = System.in;
             int i = is.read();
             System.out.println(i);
             System.out.write(i);
             System.out.flush();*/
		
	/*	 DataInputStream dis = new DataInputStream(System.in);
		 String data = dis.readLine();
		 dis.read
		 System.out.println(data);*/
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Anil\\workspace\\java_evng_sep\\day10-threads-io\\src\\io\\TestIO.java");
	    int data = 0;
	    data = fis.read();
	    while(data != -1){
	    	
	    	             System.out.print((char)data);
	    	             data = fis.read();
	    }
		
		fis.close();
		
	}

}
