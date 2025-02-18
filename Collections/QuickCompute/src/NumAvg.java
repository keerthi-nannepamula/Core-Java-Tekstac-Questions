import java.util.*;
import java.util.stream.Collectors;

public class NumAvg {

    private TreeSet<Integer> numSet=new TreeSet<Integer>();

    public TreeSet<Integer> getNumSet() {
		return numSet;
	}

	public void setNumSet(TreeSet<Integer> numSet) {
		this.numSet = numSet;
	}

	public void addNum(int num)
    {
	    if(num%5!=0 && num%6!=0) {
	    	this.numSet.add(num);
	    }
    }

    public double calAvg()
    {
	    double Average=numSet.stream()
	    		.mapToInt(Integer::intValue)
	    		.average()
	    		.orElse(0.0);
	    return Average;
    }
}
