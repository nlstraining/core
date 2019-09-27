
public class CreateStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		       Employee emp = new Employee();
		       emp.setName("John Doe");
		       emp.setDob("04-July-1965");
		       
		       System.out.println(emp.getDob() + emp.getName());
		       
		       
		       Employee emp2 = new Employee("04-Aug-1972","Jane Doe","1021","25-Sep-2019");
		       
		       System.out.println(emp2.getName() + emp2.getEmpno());
		      
		       System.out.println(emp2);
		       
	}

}
