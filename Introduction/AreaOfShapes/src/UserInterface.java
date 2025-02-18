import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides");
		int sides=sc.nextInt();
		if(sides==0) {
			System.out.println("Enter the radius");
			float radius=sc.nextFloat();
			double area=3.14*radius*radius;
			System.out.printf("Area of the Circle is %.2f",area);
		}else if(sides==3) {
			System.out.println("Enter the base and height");
			float base=sc.nextFloat();
			float height=sc.nextFloat();
			double area=(base*height)/2;
			System.out.printf("Area of the Triangle is %.2f",area);
		}else if(sides==4) {
			System.out.println("Enter the length");
			float length=sc.nextFloat();
			System.out.println("Enter the breadth");
			float breadth=sc.nextFloat();
			if(length==breadth) {
				double area=length*length;
				System.out.printf("Area of the Square is %.2f",area);
			}else {
				double area=length*breadth;
				System.out.printf("Area of the Rectangle is %.2f",area);
			}
		}else {
			System.out.println("Invalid side");
		}
	}

}
