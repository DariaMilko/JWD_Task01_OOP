package by.tc.task01.entity.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Criteria<E> {

	private Map<E, Object> criteria = new HashMap<E, Object>();
	private String applianceType;
	
	public Criteria() {
		this.criteria = new HashMap<E, Object>();
		this.applianceType = null;
		}

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public String getApplianceType() {
		return applianceType;
	}
	
	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
		}

	public Map<E, Object> getCriteria() {
		return criteria;
	}
	
	public List<String> getListCriteria() {
		List<String> list = new ArrayList<>();
		for (Map.Entry<E, Object> entry : criteria.entrySet()) {
			list.add(entry.getKey() + "=" + entry.getValue());
			}
		return list;
		}
	// you may add your own code here

}
