import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");	
		int size=sc.nextInt();
		
		if(size%2==0) {
			System.out.println("Please enter an odd number");
			return;
		}
		if(size<=0 || size>10) {
			System.out.println("Please enter a valid number");
			return;
		}
		
		
		System.out.println("Enter the elements");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			int x=sc.nextInt();
			if(x<=0 || x>10) {
				System.out.println("Please enter valid elements in the array");
				return;
			}
			arr[i]=x;
		}
		
		if(size==1) {
			System.out.println("The sum of the values is 0"); 
			System.out.println("The product of the values is 0");
		}else {
			if(arr[size/2]%2==0) {
				evengame(arr);
			}else {
				oddgame(arr);
			}
		}
	}

	private static void evengame(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length/2;i++) {
			sum+=arr[i];
		}
		
		int product=1;
		for(int i=(arr.length/2)+1;i<arr.length;i++) {
			product*=arr[i];
		}
		
		System.out.println("The sum of the values is "+sum);
		System.out.println("The product of the values is "+product);
	}

	private static void oddgame(int[] arr) {
		int product=1;
		for(int i=0;i<arr.length/2;i++) {
			product*=arr[i];
		}
		
		int sum=0;
		for(int i=(arr.length/2)+1;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println("The sum of the values is "+sum);
		System.out.println("The product of the values is "+product);
	}
}