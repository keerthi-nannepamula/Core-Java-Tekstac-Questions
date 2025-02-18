import java.util.Map;
import java.util.HashMap;

public class Apartment {

	private Map<String, Double> apartmentDetailsMap = new HashMap<String, Double>();

    public Map<String, Double> getApartmentDetailsMap() {
		return apartmentDetailsMap;
	}

	public void setApartmentDetailsMap(Map<String, Double> apartmentDetailsMap) {
		this.apartmentDetailsMap = apartmentDetailsMap;
	}
	
	public void addApartmentDetails(String apartmentNumber, double rent) {
        apartmentDetailsMap.put(apartmentNumber, rent);
	}

	public double findTotalRentOfApartmentsInTheGivenRange(double minimumRent, double maximumRent) {
		double sum= apartmentDetailsMap.entrySet().stream()
		.filter(e->e.getValue()>=minimumRent && e.getValue()<=maximumRent)
		.mapToDouble(Map.Entry::getValue) // Extract the rent values
        .sum();
		
		//alternate approach
		double res=0;
		for(Map.Entry<String, Double> e:apartmentDetailsMap.entrySet()) {
			if(e.getValue()>=minimumRent && e.getValue()<=maximumRent) {
				res+=e.getValue();
			}
		}
		return sum;
	}

}
