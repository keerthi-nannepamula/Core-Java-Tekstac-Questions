import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.HashMap;

public class Country {
    
    private Map<String,String> countryMap=new HashMap<String,String>();
    public Map<String, String> getCountryMap() {
		return countryMap;
	}

	public void setCountryMap(Map<String, String> countryMap) {
		this.countryMap = countryMap;
	}

	public void add(String cname,String capname)
    {
		if(!countryMap.containsKey(cname)) {
			countryMap.put(cname, capname);
		}
    }

    public String search(String cname)
    {
    	if(countryMap.isEmpty()) {
    		return "The map is empty";
    	}
//    	if(countryMap.containsKey(cname)) {
//    		return countryMap.get(cname);
//    	}else {
//    		return "Data not found";
//    	}
    	Optional<Map.Entry<String, String>> searchmap=countryMap.entrySet().stream()
    			.filter(e->e.getKey().equals(cname))
    			.findFirst();
    	return searchmap.map(Map.Entry::getValue).orElse("Data not found");
    }
}
