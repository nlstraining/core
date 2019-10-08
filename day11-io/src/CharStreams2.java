import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharStreams2 {

	public static void main(String[] args) throws IOException {
	
		// stream(s)  = origin (source)  and a destination(sink)  // char byte your program makes trips to file system
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Anil\\workspace\\java_evng_sep\\day11-io\\src\\Dest.txt"));
	    writer.write("She sells sea shells on sea shore");
	    writer.flush();
	    writer.close();
	    
	
		
	}

}
