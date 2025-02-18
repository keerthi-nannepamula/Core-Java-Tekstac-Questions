import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ForensicReport {

	private Map<String,Date> reportMap=new HashMap<String,Date>();

	public Map<String, Date> getReportMap() {
		return reportMap;
	}

	public void setReportMap(Map<String, Date> reportMap) {
		this.reportMap = reportMap;
	}

    public void addReportDetails(String reportingOfficer, Date reportFiledDate) {
		reportMap.put(reportingOfficer, reportFiledDate);
		
	}

	public List<String> getOfficersWhoFiledReportsOnDate(Date reportFiledDate){
//		Map<String,Date> result=new HashMap<String,Date>();
		List<String> officers=new ArrayList<String>();
		
		for(Map.Entry<String, Date> e:reportMap.entrySet()) {
			if(e.getValue().equals(reportFiledDate)) {
				officers.add(e.getKey());
			}
		}
		
		
		return officers;
	}
}
