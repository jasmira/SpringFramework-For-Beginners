package ramana.anno.service;

import java.util.ArrayList;
import java.util.List;

import ramana.anno.domain.Community;
import ramana.anno.domain.Country;
import ramana.anno.domain.User;

public class UserService {

	private List countryList;
	private List communityList;
	private String countryNames[] = { "India", "USA", "UK", "France" };

	@SuppressWarnings("all")
	public UserService() {

		countryList = new ArrayList();
		for (int i = 0; i < countryNames.length; i++) {
			countryList.add(new Country(i + 1, countryNames[i]));
		}

		communityList = new ArrayList();
		communityList.add(new Community("Spring", "Spring"));
		communityList.add(new Community("Hibernate", "Hibernate"));
		communityList.add(new Community("Struts", "Struts"));
		communityList.add(new Community("EJB", "EJB"));

	}

	public void add(User user) {
		// Persist the user object here.
		System.out.println("User added successfully");

	}

	public List getAllCountries() {
		return countryList;
	}

	public List getAllCommunities() {
		return communityList;
	}

	public String getCountryName(int countryCode) {
		return countryNames[countryCode];
	}
}
