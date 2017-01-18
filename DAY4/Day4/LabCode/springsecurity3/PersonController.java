package sec3.control;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import sec3.domain.Person;
import sec3.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Handles and retrieves Person related requests

@Controller
@RequestMapping("/persons")
public class PersonController {

	protected static Logger logger = Logger.getLogger("controller");

	@Resource(name = "personService")
	private PersonService personService;

	// Handles and retrieves a JSP page containing all persons

	@RequestMapping(method = RequestMethod.GET)
	public String getAllPage(Model model) {
		logger.debug("Received request to show all persons page");

		// Retrieve all persons and attach to model
		model.addAttribute("persons", personService.getAll());

		// This will resolve to /WEB-INF/jsp/personspage.jsp
		return "personspage";
	}

	// Retrieves the edit page

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String getEdit(@PathVariable Integer id, Model model) {
		logger.debug("Received request to show edit page");

		// Retrieve person with matching id then add this person to the model
		// The editpage.jsp references a model attribute named "personAttribute"
		// So we add a "personAttribute" to the model.
		// This "personAttribute" will be referenced again once we send the
		// update form data
		// We could have chosen a different name like "person" for the model
		// If you do, make sure you update the JSP that references this name
		// And update the POST method below that receives the request to do the
		// actual update!
		model.addAttribute("personAttribute", personService.get(id));


		// This will resolve to /jsp/editpage.jsp
		return "editpage";
	}

	// Saves the edited person and display all persons again

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public String saveEdit(@ModelAttribute("personAttribute") Person person,
			@PathVariable Integer id, Model model) {
		logger.debug("Received request to update person");

		// The "personAttribute" model has been passed to the controller from
		// the JSP We use the name "personAttribute" because the JSP uses that name

		// We manually assign the id because we disabled it in the JSP page
		// When a field is disabled it will not be included in the
		// ModelAttribute
		
		person.setId(id);

		// Delegate to PersonService for editing
		// We show the all persons page again after updating the person
		personService.edit(person);

		// Retrieve all persons and attach to model
		model.addAttribute("persons", personService.getAll());

		// This will resolve to /jsp/personspage.jsp
		return "personspage";
	}
}
