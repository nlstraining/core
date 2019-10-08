import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CharStreams {

	public static void main(String[] args) throws IOException {
	
		// stream(s)  = origin (source)  and a destination(sink)  // char byte your program makes trips to file system
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Anil\\workspace\\java_evng_sep\\day11-io\\src\\CharStreams.java"));
		String data = reader.readLine();		     
		while(data != null){
			
			                System.out.println(data);
			                data = reader.readLine();
		}
	
		
	}

}
