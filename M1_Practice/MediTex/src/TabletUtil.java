import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TabletUtil {
	
	public List<Tablet> retrieveTabletsByBrand(Stream<Tablet> tabletStream, String brand) {
        
        return tabletStream.filter(e->e.getBrand().equals(brand)).collect(Collectors.toList());
    }
	
	public List<String> getTabletsAboveMg(Stream<Tablet> tabletStream, int mg) {
	    
	    return tabletStream.filter(e->e.getMg()>=mg).map(Tablet::getName).collect(Collectors.toList());
	}
}

