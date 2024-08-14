package sortStudentsbyAge;

public class Student implements Comparable<Student>{
	private String sName;
	private int sRollNo;
	private int phoneNo;
	public Student(String sName, int sRollNo, int phoneNo) {
		this.sName = sName;
		this.sRollNo = sRollNo;
		this.phoneNo = phoneNo;
	}
	public void setName(String sName) {
		this.sName = sName;
	}
	public void setRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return this.sName;
	}
	public int getRollno() {
		return this.sRollNo;
	}
	public int getPhoneNo() {
		return this.phoneNo;
	}
	@Override
	public int compareTo(Student o) {
		return this.sRollNo - o.sRollNo;
	}
	public String toString() {
		return "Name: " + this.sName + " |RollNo: " + this.sRollNo;
	}
}
