
public class DonorDetails 
{
	private String name;
	private int age;
	private String gender;
	private String bloodGroup;
	private long phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public DonorDetails(String name, int age, String gender, String bloodGroup, long phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.phoneNumber = phoneNumber;
	}
	
	public void getDetails() {
		System.out.println("Name:"+this.getName());
		System.out.println("Age:"+this.getAge());
		System.out.println("Gender:"+this.getGender());
		System.out.println("Blood group:"+this.getBloodGroup());
		System.out.println("Phone no:"+this.getPhoneNumber());
	}
}