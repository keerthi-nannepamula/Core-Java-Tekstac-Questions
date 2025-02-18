
public class CustomerDetails implements BonusPoints,DoorDelivery{
	
	private String customerNames;
	private String phoneNumber;
	private String streetName;
	private double billAmount;
	private int distance;
	
	
	public String getCustomerNames() {
		return customerNames;
	}

	public void setCustomerNames(String customerNames) {
		this.customerNames = customerNames;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public CustomerDetails(String customerNames, String phoneNumber, String streetName, double billAmount,
			int distance) {
		super();
		this.customerNames = customerNames;
		this.phoneNumber = phoneNumber;
		this.streetName = streetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}

	@Override
	public double deliveryCharge() {
		if(this.getDistance()>=25) {
			return (this.getDistance()*8);
		}else if(this.getDistance()>=15 && this.getDistance()<25) {
			return (this.getDistance()*5);
		}else if(this.getDistance()<15) {
			return (this.getDistance()*2);
		}
		return 0;
	}

	@Override
	public double calculateBonusPoints() {
		if(this.getBillAmount()>=250) {
			double x= this.getBillAmount()/10;
			return x;
		}else if(this.getBillAmount()<250) {
			return 0;
		}
		return 0;
	}
	
	public void getDetails() {
		System.out.println("Customer name: "+this.getCustomerNames());
		System.out.println("Phone number: "+this.getPhoneNumber());
		System.out.println("Street name: "+this.getStreetName());
		System.out.println("Bonus points: "+ this.calculateBonusPoints());
		System.out.println("Delivery charge: "+this.deliveryCharge());
	}
}
