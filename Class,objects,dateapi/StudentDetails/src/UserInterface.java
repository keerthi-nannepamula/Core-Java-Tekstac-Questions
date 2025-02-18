import java.util.Scanner;
public class UserInterface {
	
	public static void main(String[] arg)
    {	
		Student s1=new Student();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        s1.setStudentId(sc.nextInt());
        System.out.println("Enter Student's Name:");
        s1.setStudentName(sc.next());
        System.out.println("Enter Student's address:");
        s1.setStudentAddress(sc.next());
        String s="";
        do {
        	System.out.println("Whether the student is from NIT(Yes/No):");
        	s=sc.next();
            if(s.equalsIgnoreCase("NO")) {
            	System.out.println("Enter the college name:");
            	s1.setCollegeName(sc.next());
            	s1.getDetails();
            }else if(s.equalsIgnoreCase("YES")) {
            	s1.setCollegeName("NIT");
            	s1.getDetails();
            }else if(!s.equalsIgnoreCase("NO") ||!s.equalsIgnoreCase("yes") ){
            	System.out.println("Wrong Input");
            }
        }while(!(s.equalsIgnoreCase("NO") ||s.equalsIgnoreCase("yes")));
    }
}

