package comperator;

public class StringSortingCompare {
	private String sName;
	private int sId;
	private double sMarks;
	public StringSortingCompare(String sName, int sId, double sMarks) {
		this.sName = sName;
		this.sId = sId;
		this.sMarks = sMarks;
	}

	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public double getsMarks() {
		return sMarks;
	}
	public void setsMarks(double sMarks) {
		this.sMarks = sMarks;
	}
	
	public String toString(){
		return "Name: " + this.sName + " |Id: " + this.sId + " |Marks: " + this.sMarks;
	}
}
