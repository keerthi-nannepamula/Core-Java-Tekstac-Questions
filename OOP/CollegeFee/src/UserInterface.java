import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Student Id");
    	int id=sc.nextInt();
    	System.out.println("Enter Student name");
    	String name=sc.nextLine();
    	sc.nextLine();
    	System.out.println("Enter Department name");
    	String dept=sc.nextLine();
    	System.out.println("Enter gender");
    	String gen=sc.nextLine();
    	System.out.println("Enter category");
    	String cat=sc.nextLine();
    	
    	if(cat.equals("Hosteller")) {
    		System.out.println("Enter College fee");
    		double fee=sc.nextDouble();
    		System.out.println("Enter the room number");
    		int room=sc.nextInt();
    		System.out.println("Enter the Block name");
    		char ch=sc.next().charAt(0);
    		System.out.println("Enter the room type");
    		String type=sc.nextLine();
    		sc.nextLine();
    		Hosteller h = new Hosteller(id, name, dept, gen, cat, fee, room, ch, type);
            double totalfee = h.calculateTotalFee();
            System.out.printf("Total College fee is %.2f", totalfee);
    	}else if(cat.equals("DayScholar")) {
    		System.out.println("Enter College fee");
    		double fee=sc.nextDouble();
    		System.out.println("Enter Bus number");
    		int bno=sc.nextInt();
    		System.out.println("Enter the distance");
    		float dist=sc.nextFloat();
    		
    		DayScholar ds = new DayScholar(id, name, dept, gen, cat, fee, bno, dist);
            System.out.printf("Total College fee is %.2f", ds.calculateTotalFee());
    	}
	}

}
