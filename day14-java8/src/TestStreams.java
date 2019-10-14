import java.util.Arrays;
import java.util.List;


public class TestStreams {

	public static void main(String[] args) {
		// map reduce - take data from various sources identify features and group them and count them
	
		/*Stream.of("mango","cherry","apple","berry","jack","orange")
		.sorted()
		.findFirst()
		.ifPresent(System.out::print);
		*/
		
	List<String> fruits=	Arrays.asList("mango","cherry","apple","berry","jack","orange");
    fruits.stream().sorted().findFirst().ifPresent(System.out::println);
	long count = fruits.stream().filter((s) -> (s.length()> 5)).count();
	System.out.println(count);
	
	}

}
