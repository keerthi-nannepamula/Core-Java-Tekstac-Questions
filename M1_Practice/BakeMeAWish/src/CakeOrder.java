import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

public class CakeOrder {

	private Map<String,Double> orderMap=new HashMap<String,Double>();

	public Map<String, Double> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(Map<String, Double> orderMap) {
		this.orderMap = orderMap;
	}
    
    public void addOrderDetails(String orderId, double cakeCost) {
		orderMap.put(orderId, cakeCost);
		
	}
	
	public Map<String, Double> findOrdersAboveSpecifiedCost(double cakeCost) {
		Map<String,Double> filteredMap=new HashMap<String,Double>();
//		for(Map.Entry<String, Double> e:orderMap.entrySet()) {
//			if(e.getValue()>cakeCost) {
//				filteredMap.put(e.getKey(), e.getValue());
//			}
//		}
		orderMap.entrySet().stream()
                .filter(entry -> entry.getValue() > cakeCost)
                .forEach(entry -> filteredMap.put(entry.getKey(), entry.getValue()));
		
		return filteredMap;
	}


}
