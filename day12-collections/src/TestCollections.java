import java.util.ArrayList;

// where everything is an object - how to persist it
// how to provide / meet the needs of objects or services
// Collections framework is - 1. provide some common functionality of 
// storage ( create a cache) , search and make copies (views)
// we talk about or we say they are containers for objects - bean bag, need chair, 
// they provide you an uniform interface - time tested, consistent and easy to use 
// collection implementations they grow in size 
// all collections are generic  vs generics make collections type specific
// add, find, modify and remove and iterate, shuffle , sort search
public class TestCollections {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		/*
		 * int a =new Integer("10"); // primitives and wrapper types were not
		 * compatible list.add(a); list.add('c');
		 */
		list.add(new Integer("10"));
		
		Integer i = list.get(0);
	//	String str = list.get(0);
		
	//	list.add(new String("hello"));
	//	list.add(new Double("10.10"));

	/*	System.out.println(list);
		Object obj = list.get(1);
		if (obj instanceof String) {
			String str = (String) obj;
		    System.out.println(str);
		}	else if (obj instanceof Integer) {
			Integer in = (Integer) obj;
			System.out.println(in);
		}else if (obj instanceof Double) {
			Double in = (Double) obj;
			System.out.println(in);
		}*/
	}

}
