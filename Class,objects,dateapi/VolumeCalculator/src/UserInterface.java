import java.util.Scanner;
public class UserInterface {
	
	public static void main(String[] arg)
    {
		VolumeCalculator vc=new VolumeCalculator();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice "
        		+ "\n1.Find Volume For Cylinder"
        		+ "\n2.Find Volume For Cuboid");
        int choice=sc.nextInt();
        switch(choice) {
        case 1:
        	System.out.println("Enter the radius");
        	double radius=sc.nextDouble();
        	System.out.println("Enter the height");
        	double height=sc.nextDouble();
        	vc.calculateVolume(radius, height);
        	break;
        	
        case 2:
        	System.out.println("Enter the length");
        	int length=sc.nextInt();
        	System.out.println("Enter the breadth");
        	int breadth=sc.nextInt();
        	System.out.println("Enter the height");
        	int height_cuboid=sc.nextInt();
        	vc.calculateVolume(length, breadth, height_cuboid);
        	break;
        }
    }
}

