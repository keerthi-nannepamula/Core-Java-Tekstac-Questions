import java.util.*;
import java.util.stream.Collectors;

public class Car {

    private Map<String, Integer> carMap = new TreeMap<>();

    public Map<String, Integer> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Integer> carMap) {
        this.carMap = carMap;
    }

    public void addCar(String name, int num) {
    	carMap.merge(name.toLowerCase(), num, Integer::sum);
    	
    }

    public int carByName(String name) {
        if (carMap.isEmpty()) {
            return 0;
        } else {
            return carMap.getOrDefault(name.toLowerCase(), -1);
        }
    }

    public List<String> carByCount(int count) {
        List<String> result = carMap.entrySet().stream()
                .filter(e -> e.getValue() >= count)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return result.isEmpty() ? null : result;
    }

    public int totalCarsSold() {
        return carMap.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}