
public class Student {
	
	public Student() {
		super();
	}
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
	
	
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName="NIT";
	}
	public void getDetails() {
		System.out.println("Student id:"+this.studentId);
		System.out.println("Student name:"+this.studentName);
		System.out.println("Address:"+this.studentAddress);
		System.out.println("College name:"+this.collegeName);
	}
	
}
