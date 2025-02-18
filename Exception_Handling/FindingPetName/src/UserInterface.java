import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserInterface {

	public static String findPetName(String fileName) {
		 try (FileReader fr = new FileReader("inputfeed.txt");
	             BufferedReader br = new BufferedReader(fr)) {

	            String line;
	            while ((line = br.readLine()) != null) {
	                if (hasExactlyTwoVowels(line)) {
	                    return line;
	                }
	            }
	        } catch (FileNotFoundException e) {
	            return "Please give the correct file name";
	        } catch (IOException e) {
	            return "Error occurred while reading the names from file";
	        }
	        return "No name found with exactly two vowels";
	    }

	    private static boolean hasExactlyTwoVowels(String name) {
	        int vowelCount = 0;
	        for (char c : name.toCharArray()) {
	            if (isVowel(c)) {
	                vowelCount++;
	            }
	            if (vowelCount > 2) {
	                return false;
	            }
	        }
	        return vowelCount == 2;
	    }

	    private static boolean isVowel(char c) {
	        return "AEIOUaeiou".indexOf(c) != -1;
	    }

	    public static void main(String[] args) {
//	        UserInterface ui = new UserInterface();
	        String fileName = "names.txt"; // Replace with the actual file name
	        String petName = UserInterface.findPetName(fileName);
	        System.out.println(petName);
	    }

}
