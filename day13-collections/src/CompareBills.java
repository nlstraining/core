import java.util.Comparator;


public class CompareBills implements Comparator<Bill> {

	@Override
	public int compare(Bill arg0, Bill arg1) {
		
		 if(arg0.getBiiId().compareTo(arg1.getBiiId()) < 0)
			 return -1;
		 else if(arg0.getBiiId().compareTo(arg1.getBiiId()) == 0)
			 return 0;
		 else
			 return 1;
	}

}
