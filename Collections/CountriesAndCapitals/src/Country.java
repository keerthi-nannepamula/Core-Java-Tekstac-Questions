import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Country {
    
    private Map<String, String> countryMap = new HashMap<>();

    public Map<String, String> getCountryMap() {
        return countryMap;
    }

    public void setCountryMap(Map<String, String> countryMap) {
        this.countryMap = countryMap;
    }

    public void add(String cname, String capname) {
        countryMap.put(cname.toLowerCase(), capname);
    }

    public String search(String cname) {
        if (countryMap.isEmpty()) {
            return "The map is empty";
        }

        Optional<Map.Entry<String, String>> searchmap = countryMap.entrySet().stream()
                .filter(e -> e.getKey().equalsIgnoreCase(cname))
                .findFirst();
        return searchmap.map(Map.Entry::getValue).orElse("Data not found");
    }
}