import java.util.Scanner;

public class UserInterface {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Endowment Id");
		String id=sc.nextLine();
		
		System.out.println("Enter Holder Name");
		String name=sc.nextLine();
		
		System.out.println("Enter Endowment Type");
		String type=sc.nextLine();
		
		if(type.equalsIgnoreCase("educational")) {
			System.out.println("Enter Registration Date");
			String date=sc.nextLine();
			
			System.out.println("Enter Educational Institution");
			String institute=sc.nextLine();
			
			System.out.println("Enter Educational Division");
			String division=sc.nextLine();
			
			EducationalEndowment edem=new EducationalEndowment(id, name, type, date, institute, division);
			double endowmentAmount=edem.calculateEndowment();
			System.out.printf("Endowment Amount %.2f",endowmentAmount); 
			
		}else if(type.equalsIgnoreCase("health")) {
			System.out.println("Enter Registration Date");
			String date=sc.nextLine();
			
			System.out.println("Enter Health Care Center");
			String carecenter=sc.nextLine();
			
			System.out.println("Enter Holder Age");
			int age=sc.nextInt();
			
			HealthEndowment hem=new HealthEndowment(id, name, type, date, carecenter, age);
			double endowmentAmount=hem.calculateEndowment();
			System.out.printf("Endowment Amount %.2f",endowmentAmount);
		}else {
			System.out.println(type+" is an invalid endowment type");
			return;
		}
	}

}
