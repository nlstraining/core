import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class TestStreams {

	public static void main(String[] args) {
		// map reduce - take data from various sources identify features and group them and count them
	
		
		Stream.of("mango","cherry","apple","berry","jack","orange")
		.sorted()
		.findFirst()
		.ifPresent(System.out::print);
		
		
	List<String> fruits=	Arrays.asList("mango","cherry","apple","berry","jack","orange");
    fruits.stream().sorted().findFirst().ifPresent(System.out::println);
	long count = fruits.stream().filter((s) -> (s.length()> 5)).count();
	//System.out.println(count);
	//fruits.stream().filter((s) -> (s.length()> 5)).map((x) -> (x.toUpperCase())).forEach(System.out::println);
	
	
	ArrayList<String> flist = new ArrayList<>();
	flist.add("mango");
	flist.add("cherry");
	flist.add("apple");
	flist.add("berry");
	flist.add("plum");
   flist.add("banana");
   flist.add("blueberry");
   
   // we have to create a new list with fruits which start with letter 'b'
      List<String> blist = new ArrayList<>();
      
      Iterator<String> iter = flist.iterator();
      while(iter.hasNext()){
    	           String fruit = iter.next();
    	           if(fruit.startsWith("b")){
    	        	   blist.add(fruit.toUpperCase());
    	           }
        }
   //   System.out.println(blist);
	     blist = flist.stream().
    		     filter((f) -> (f.startsWith("b"))).
    		     map((s) ->(s.toUpperCase())).
    		     collect(Collectors.toList());
     
      //    System.out.println(blist);
              flist.stream().
		     filter((f) -> (f.startsWith("b"))).
		     map((s) ->(s.toUpperCase())).
		     forEach(System.out::println); // :: method reference , ::new
          
          System.out.println(IntStream.range(1,10).summaryStatistics());
   
	}

}
