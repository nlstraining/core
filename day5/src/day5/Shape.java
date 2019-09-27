package day5;

public abstract class Shape {  //  it cannot be insta

	  static final double pie = 3.1467; // abstract not applicable to variables
	  
	  public Shape() {
		// what is its use
	}
	  public abstract double area(); // 
	  public String getName(){  // non-abstract methods
		  
		  return "this is just Shape";
	  }
}
