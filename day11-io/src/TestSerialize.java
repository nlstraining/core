import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class TestSerialize {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
  
		 Employee emp = new Employee();
		 emp.ename="John Doe";
		 emp.salary =85000;
		 
		 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.dat"));
		 oos.writeObject(emp);
		 oos.close();
		 
		 
	}

}
