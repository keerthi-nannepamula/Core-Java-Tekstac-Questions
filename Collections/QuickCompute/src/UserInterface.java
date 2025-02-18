import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		NumAvg na=new NumAvg();
		int ch=0;
		do {
			System.out.println("1.Add number\n2.Find average\n3.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			if(ch==1) {
				System.out.println("Enter the number");
				int num=sc.nextInt();
				na.addNum(num);
			}else if(ch==2) {
				if(na.getNumSet().isEmpty()) {
					System.out.println("The set is empty");
				}else {
					System.out.println(na.calAvg());
				}
			}else if(ch==3) {
				System.out.println("Thankyou for using the application");
				return;
			}
		}while(ch!=3);
		
	}
}
