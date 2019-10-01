
public class JustThrow {

	public static void main(String[] args) {
		try{
		System.out.println("Every day is a Sunday".charAt(30));
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
      System.out.println("after catch.....");
	}

}
