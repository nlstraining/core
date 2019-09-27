
public class Employee extends Person {

         private String empno;
         private String doj;
         
         public Employee() {
			// TODO Auto-generated constructor stub
		}
         
		public Employee(String empno, String doj) {
		
			this.empno = empno;
			this.doj = doj;
		}
		
		public Employee(String dob, String name,String empno, String doj) {
			super(dob,name); // call to constructor , know as constructor chaining, to its immediate 
			this.empno = empno;
			this.doj = doj;
		}




		public String getEmpno() {
			return empno;
		}

		public void setEmpno(String empno) {
			this.empno = empno;
		}

		public String getDoj() {
			return doj;
		}

		public void setDoj(String doj) {
			this.doj = doj;
		}

		@Override
		public String toString() {
			return "Employee [empno=" + empno + ", doj=" + doj + "]";
		}
	
         
}
