package day3;

public class Person  {

	private String dob;
	private String name;

	public Person() {
         System.out.println("from Parent Person()");
	}

	public Person(String dob) {

		this.dob = dob;

	}

	public Person(String dob, String name) {

		this.dob = dob;
		this.name = name;
	}

	public Person(Person person) { // copy constructor

		this.dob = person.getDob();
		this.name = person.getName();
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
