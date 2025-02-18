import java.util.HashSet;
import java.util.Set;

public class ClassHouseFormation {

	HashSet<String> studSet=new HashSet<String>();
	
	public HashSet<String> getStudSet() {
		return studSet;
	}

	public void setStudSet(HashSet<String> studSet) {
		this.studSet = studSet;
	}

	public void addName(String details)
	{
		String[] input=details.split(":");
		if(input.length==2) {
			studSet.add(input[1]);
		}
	}
	
	public HashSet<String> formTeam()
	{
		HashSet<String> result=new HashSet<String>();
		String house="";
		for(String s:studSet) {
			if(s.charAt(0)>='A' && s.charAt(0)<='H') {
				house="RED";
			}else if(s.charAt(0)>='I' && s.charAt(0)<='P') {
				house="BLUE";
			}else if(s.charAt(0)>='Q' && s.charAt(0)<='Z') {
				house="GREEN";
			}
			result.add(s+":"+house);
		}
		return result;
	}
}
