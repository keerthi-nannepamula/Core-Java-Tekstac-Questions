import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String num=sc.nextLine();
		if(num.length()!=4) {
			System.out.println(num+" is an invalid number");
		}else {
			StringBuilder sb=new StringBuilder(num).reverse();
			int reversed=Integer.parseInt(sb.toString());
			System.out.println("Reversed number is "+reversed);
			
			expand(reversed);
			
			sc.close();
		}
	}

	private static void expand(int num) {
		int p=1;
		List<Integer>expanded=new ArrayList<Integer>();
		while(num!=0) {
			int i=num%10;
			i=i*p;
			num=num/10;
			p=p*10;
			expanded.add(i);
		}
		for (int i = expanded.size() - 1; i >= 0; i--) {
            int a = expanded.get(i);
            if (i != 0) {
                System.out.print(a + "+");
            } else {
                System.out.print(a);
            }
        }
	}

}

