package practice.service

import groovy.util.GroovyTestCase
import org.junit.Test
import practice.database.dao.PersonContactInfoDao
import practice.database.entity.PersonContactInfo

/**
 * 
 * @author Kavitha R
 *
 */

class PersonContactServiceTest {
    
	
	
	@Test
	public void appendFirstAndLastNamesTest() {
		def personContactService = new PersonContactService()
		String fullName = personContactService.appendFirstAndLastNames('A', 'B')
		assert fullName == 'A B'
	}
	
	@Test
	public void saveContact() {
		def calledMethods = []
		
		def personContactInfoDao = [
			save: {PersonContactInfo personContactInfo ->
				calledMethods.add("save");
				assert personContactInfo.firstName == 'f'
				assert personContactInfo.lastName == 'l'
				assert personContactInfo.fullName == 'f l'
				assert personContactInfo.email == 'e'
				assert personContactInfo.phoneNumber == '123'
				return true;}
		] as PersonContactInfoDao
		
		def personContactService = new PersonContactService()
		personContactService.personContactInfoDao = personContactInfoDao
		
		personContactService.saveContact('f', 'l', 'f l', 'e', '123')
		
		assert calledMethods.size() == 1
		assert calledMethods.get(0) == 'save'
		
	}
}