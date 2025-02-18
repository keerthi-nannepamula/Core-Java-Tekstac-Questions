import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in kg");
		float weight=sc.nextFloat();
		System.out.println("Enter height in cm");
		float height=sc.nextFloat();
		
		double bmi=weight/((height/100) *(height/100));
		if(bmi>=25) {
			System.out.printf("Your BMI is %.2f. You are overweight",bmi);
			double reduce=bmi-25;
			System.out.println();
			System.out.printf("Reduce %.2f kg to be fit",reduce);
		}else if(bmi<25 && bmi>=18.5){
			System.out.printf("Your BMI is %.2f. You are fit and healthy",bmi);
		}else if(bmi<18.5) {
			System.out.printf("Your BMI is %.2f. You are underweight",bmi);
			double gain=18.5-bmi;
			System.out.println();
			System.out.printf("Gain %.2f kg to be fit",gain);
		}
	}

}
