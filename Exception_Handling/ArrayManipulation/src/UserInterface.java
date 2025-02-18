import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface
{
	public static String getDuplicateElement()
    {	
		try {
			Scanner sc=new Scanner(System.in);
		       System.out.println("Enter the size of an array");
		       int size=sc.nextInt();
		       if(size<0) {
		    	   throw new NegativeArraySizeException("Array size should be positive");
		       }
		       System.out.println("Enter the array elements");
		       int[] arr=new int[size];
		       for(int i=0;i<size;i++) {
		    	   arr[i]=sc.nextInt();
		       }
		       System.out.println("Enter the position of the element to be replicated");
		       int index=sc.nextInt();
		       
		       if(index>=size) {
		    	   throw new ArrayIndexOutOfBoundsException("Array index is out of range");
		       }
		       int replicate=0;
		       StringBuilder result = new StringBuilder("The array elements are ");
	            for (int i = 0; i < size; i++) {
	                result.append(arr[i]).append(" ");
	                replicate=arr[index];
	            }
	            result.append(replicate); 
	            System.out.print(result);
	            return result.toString();
		}catch(ArrayIndexOutOfBoundsException e) {
	    	   return e.getMessage();
		}catch(InputMismatchException e) {
	    	   return "Input was not in the correct format";
       }catch(NegativeArraySizeException e) {
	    	   return e.getMessage();
       }
    }
	
	public static void main(String[] args)
    {
	   getDuplicateElement();

    }
}