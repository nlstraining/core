import java.util.TreeSet;


public class TestCollections3 {

	public static void main(String[] args) {
		Bill b1 = new Bill("J10201F","Jan2019");
		Bill b2 = new Bill("J10201G","Jan2019");
		Bill b3 = new Bill("J10201G","Jan2019");
		Bill b4 = new Bill("J10202G","Feb2019");
		// Set - TreeSet - data structures - linear ds - never ordered ( always in insertion order)
      
		 TreeSet tree = new TreeSet();
		 tree.add("mango");
		 tree.add("apple");
		 tree.add("banana");
		 tree.add("orange");
		 
		 System.out.println(tree);
		 
		 TreeSet<Bill> treeBill = new TreeSet<>(new CompareBills());
		 
		 treeBill.add(b1);
		 treeBill.add(b2);
		 treeBill.add(b3);
		 treeBill.add(b4);
		 System.out.println(treeBill.size());
		 System.out.println(treeBill);
		
		 
	}

}
