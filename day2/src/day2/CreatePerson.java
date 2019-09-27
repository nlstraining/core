package day2;

public class CreatePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a=10;
           Integer i  = new Integer("10");
		   Person person1 = new Person();  
		   
	/*	   System.out.println(person1.dob);
		   System.out.println(person1.name);*/
		   
		   person1.setName("John Doe");  
		   person1.setDob("4-July-1972");
		   
		   System.out.println(person1.getDob());
		   System.out.println(person1.getName());
		   
		   Person person2 = new Person("23-Aug-1985","Kate Winslet");
		//   Person person3 = new Person(person2);
		   
		   
		   System.out.println(person2.getDob());
		   System.out.println(person2.getName());
		   
		   
	}

}
