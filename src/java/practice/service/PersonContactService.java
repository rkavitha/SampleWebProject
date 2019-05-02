package practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import practice.database.dao.PersonContactInfoDao;
import practice.database.entity.PersonContactInfo;

/**
 * 
 * @author Kavitha R
 *
 */
@Component
public class PersonContactService {
	
	@Autowired
	PersonContactInfoDao personContactInfoDao;

	/**
	 * Sample method that has business logic
	 * @return
	 */
	public String appendFirstAndLastNames(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	public void saveContact(String firstName, String lastName, String fullName, String email, String phoneNumber) {
		PersonContactInfo personContactInfo = new PersonContactInfo();
		personContactInfo.setFirstName(firstName);
		personContactInfo.setLastName(lastName);
		personContactInfo.setFullName(fullName);
		personContactInfo.setEmail(email);
		personContactInfo.setPhoneNumber(phoneNumber);
		personContactInfoDao.save(personContactInfo);
		
	}
}
