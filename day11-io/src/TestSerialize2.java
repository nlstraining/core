import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TestSerialize2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
  
		
		 
		 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.dat"));
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp.ename);
		 
		 
	}

}
