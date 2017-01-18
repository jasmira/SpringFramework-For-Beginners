package collection;

import java.util.List;
import java.util.Map;

public class CollegeBean {
	private List<Object> lists;
	
	private Map<Integer,String> countryMap;

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	
	public Map<Integer, String> getCountryMap() {
		return countryMap;
	}

	public void setCountryMap(Map<Integer, String> countryMap) {
		this.countryMap = countryMap;
	}

	@Override
	public String toString() {
		return "CollegeBean [lists=" + lists + ", countryMap=" + countryMap
				+ "]";
	}

	
}
