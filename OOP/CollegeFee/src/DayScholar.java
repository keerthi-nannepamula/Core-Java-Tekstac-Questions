
public class DayScholar extends Student{
	
	private int busNumber;
	private float distance;
	
	
	
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}



	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int busNumber, float distance) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
	}
	
	public double calculateTotalFee() {
		double busfee=0;
		if(this.getDistance()>30 && this.getDistance()<=40) {
			busfee=28000;
		}else if(this.getDistance()>20 && this.getDistance()<=30) {
			busfee=20000;
		}else if(this.getDistance()>10 && this.getDistance()<=20) {
			busfee=12000;
		}
		else if(this.getDistance()<=30) {
			busfee=6000;
		}
		
		double totalAmount=this.getCollegeFee()+busfee;
		return totalAmount;
	}

}
