import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strList = Arrays.asList("monday", "", "longday",
				"holiday", "payday", "");
		Predicate<String> emptyPred = ((str) -> !str.isEmpty());
		System.out.println(strList.size());
      strList = removeEmptyStrings(strList,emptyPred);
      System.out.println(strList);
	}

	public static List<String> removeEmptyStrings(List<String> list,
			Predicate<String> pred) {

		List<String> newList = new ArrayList<>();
		for (String str : list) {

			if (pred.test(str)) {

				newList.add(str);
			}

		}
		return newList;
	}

}
