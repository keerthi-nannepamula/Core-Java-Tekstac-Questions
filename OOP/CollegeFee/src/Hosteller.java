
public class Hosteller extends Student{

	private int roomNumber;
	private char blockName;
	private String roomType;
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public char getBlockName() {
		return blockName;
	}
	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int roomNumber, char blockName, String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.roomNumber = roomNumber;
		this.blockName = blockName;
		this.roomType = roomType;
	}
	@Override
	public double calculateTotalFee() {
		double hostelFee = 0;
        double roomTypeAmount = 0;
        switch (blockName) {
            case 'A':
                if (this.getRoomType().equals("AC")) {
                    roomTypeAmount = 60000 + 8000;
                } else if (this.getRoomType().equals("Non-AC")) {
                    hostelFee = 60000;
                }
                break;
            case 'B':
                if (this.getRoomType().equals("AC")) {
                    roomTypeAmount = 50000 + 5000;
                } else if (this.getRoomType().equals("Non-AC")) {
                    hostelFee = 50000;
                }
                break;
            case 'C':
                if (this.getRoomType().equals("AC")) {
                    roomTypeAmount = 40000 + 2500;
                } else if (this.getRoomType().equals("Non-AC")) {
                    hostelFee = 40000;
                }
                break;
        }

        if (this.getRoomType().equals("AC")) {
            return this.getCollegeFee() + roomTypeAmount;
        } else if (this.getRoomType().equals("Non-AC")) {
            return this.getCollegeFee() + hostelFee;
        }

        return 0;
    }
}
	
