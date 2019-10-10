public class Bill {
	String biiId;
	String issueYear;

	public Bill(String biiId, String issueYear) {
		super();
		this.biiId = biiId;
		this.issueYear = issueYear;
	}

	public String getBiiId() {
		return biiId;
	}

	public void setBiiId(String biiId) {
		this.biiId = biiId;
	}

	public String getIssueYear() {
		return issueYear;
	}

	public void setIssueYear(String issueYear) {
		this.issueYear = issueYear;
	}

	@Override
	public boolean equals(Object obj) {
		Bill ref = (Bill) obj;
		if (this.biiId.equals(ref.getBiiId()) && this.issueYear.equals(ref.getIssueYear()))
			return true;
		else
			return false;
	}
	@Override
	public int hashCode(){
		
			return this.biiId.length() * 32 + this.issueYear.length() * 32;
		
		
	}

	@Override
	public String toString() {
		return "Bill [biiId=" + biiId + ", issueYear=" + issueYear + "]";
	}

}
