package validation;

import org.springframework.validation.*;
public class PersonValidator implements Validator {
	public boolean supports(Class clazz) {
	return Person.class.equals(clazz);
	}
	
	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
		Person p = (Person) obj;
		if (p.getAge() < 0) {
			e.rejectValue("age","10", "negativevalue");
		} else if (p.getAge() > 110) {
				e.rejectValue("age","20", "too.darn.old");
			}
		}
	}

