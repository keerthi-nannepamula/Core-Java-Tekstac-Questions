import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CartonUtility {
	private List<Carton> cartonList;
	
	public List<Carton> getCartonList() {
		return cartonList;
	}

	public void setCartonList(List<Carton> cartonList) {
		this.cartonList = cartonList;
	}

	public Stream<Carton> convertToStream() {
		Stream<Carton> cartonlistStream=cartonList.stream();
		 
		return cartonlistStream;
	}

	public Carton findMax(Stream<Carton> stream1) {
		return stream1.sorted()
		.max(Comparator.comparingInt(Carton::getQuantity))
		.orElse(null);					
	}
	

}
