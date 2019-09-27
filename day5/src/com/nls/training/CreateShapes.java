package com.nls.training;

public class CreateShapes {

	public static void main(String[] args) {
	
		    Shape shape;// = new Shape();
		    
		   /* Rectangle rect = new Rectangle(23.75, 123.87);
		   
		    System.out.println(rect.getName() + ": "+ rect.area() + rect);
		    
		    Circle cir = new Circle(65.5);
		    System.out.println(cir.getName() +":"+ cir.area() + cir);*/
		    
		    shape = new Rectangle(23.87,78.65);  // byte  b = 10;  int i = b; 
		    shape = new Circle(87.98);                    // short s = 30; int j = s;
		    
		    System.out.println(shape.area() + shape.getName());
		    
	}

}
