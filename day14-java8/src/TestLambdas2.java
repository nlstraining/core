@FunctionalInterface
interface Math {
	/*
	 * public double add(); 
	 * public double multiplication();
	 */
 
	public double operation(double a, double b);
}    
interface Paint{
	
	 public void draw();	 
}
interface Player{
	
	 public String play();
}

class MathImpl implements Math{

	@Override
	public double operation(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class TestLambdas2 {

	public static void main(String[] args) {

		Math math = new Math() {

			public double operation(double a, double b) {
				return a * b;
			}
		};

		System.out.println(math.operation(10, 20));

		math = new Math() {

			public double operation(double a, double b) {
				return a + b;
			}
		};

		System.out.println(math.operation(10, 20));
		
		math = (a,b)->{ return a * b;};
		System.out.println(math.operation(25, 75));
		math = (a,b)->{ return a /b;};
		System.out.println(math.operation(225, 75));
		
		Player p = () -> { return "palying the same song...";};
		System.out.println(p.play());
		Paint paint =  ()->  System.out.println("drawing.............");
		paint.draw();
	}

}
