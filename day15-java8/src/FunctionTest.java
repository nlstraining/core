import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FunctionTest {

	public static void main(String[] args) {
		
	Function<String, Integer>	lenFunc=        (String str) -> str.length();
	List<String> strList = Arrays.asList("monday","longday","holiday","payday");
	List<Integer> lenList = getLengthOfStrings(strList,lenFunc);
	lenList = getLengthOfStrings(strList,(String str) -> str.length()+2);
	lenList.stream().forEach(System.out::print);
	}
	

	public static  List<Integer>  getLengthOfStrings(List<String> list, Function<String,Integer> func){
		List<Integer> lenList = new ArrayList<>();
		for(String str : list){
			Integer len =  func.apply(str);
			lenList.add(len);
		}
		return lenList;
	}

}
