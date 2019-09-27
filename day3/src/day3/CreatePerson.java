package day3;

public class CreatePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 
		
		
		
		
		Integer i  = new Integer("10");
		   Person person1 = new Person();  
		   
	/*	   System.out.println(person1.dob);
		   System.out.println(person1.name);*/
		   
		   person1.setName("John Doe");  
		   person1.setDob("4-July-1972");
		   
		   System.out.println(person1.getDob());
		   System.out.println(person1.getName());
		   
		   Person person2 = new Person("23-Aug-1985","Kate Winslet");
		   
		   System.out.println(person2.getDob());
		   System.out.println(person2.getName());
		   

			int a=10;
	        int b = 20;
	        
	         boolean result = ( a == b); // compare a's value with b's value - primitive comparison
	         
	         
		   result = ( person1 == person2); //? are they referring to the same memory or not ?
		   System.out.println(result);
//		   person1 = person2; // object assignment, person1 now refers to person2 object in memory

		   result = ( person1 == person2); //? are they referring to the same memory or not ?
		   System.out.println(result);
		  System.out.println(person1.getName());
		  System.out.println(person2.getName());
		   
            a = b; // a gets b's value 
	 
            result = person1.getName().equals(person2.getName());
            System.out.println(result);
            
     //     result = ( person1 == new String());
            
            Person person3 = new Person(person2);
            System.out.println(person3.getName());
  		  System.out.println(person3.getDob());
}
}
