package practice.service.dao.impl


import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration
import groovy.sql.*
import practice.database.dao.PersonContactInfoDao
import practice.database.entity.PersonContactInfo

/**
 * 
 * @author Kavitha R
 * Integration Test
 * Verifies:
 * (i) DB connection
 * (ii) Save PersonContactInfo
 * (iii) Retrieves the Saved PersonContactInfo
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/applicationContext.xml")
class PersonContactDBTest {
	
	def url= "jdbc:oracle:thin:@localhost:1521:XE"
	def username = "dbuser"
	def password = "dbuser1"
	def driver = "oracle.jdbc.driver.OracleDriver"
	
	@Autowired
	PersonContactInfoDao personContactInfoDao;
	
	@Test
	public void testDB() {
		def sql = Sql.newInstance(url, username, password, driver)
		try {
		  sql.eachRow('select sysdate from dual') { row ->
			println row
		  }
		} finally {
		  sql.close()
		}
	}
	
	@Test
	public void saveContact() {
		PersonContactInfo p = new PersonContactInfo(firstName:'fName1', lastName:'lName1', email:'fName1.lName1@hotmail.com', fullName:'flName1 lName1', phoneNumber:'123-456-790')
		personContactInfoDao.delete(p)
		personContactInfoDao.save(p)
		p.setFirstName('fName11')
		personContactInfoDao.update(p)
	}
	
	/*@Test
	public void updateContact() {
		PersonContactInfo p = new PersonContactInfo('fName11S', 'lName1', 'fName1.lName1@hotmail.com', 'flName1 lName1', '123-456-790')
		personContactInfoDao.update(p)
	}
	
	@Test
	public void deleteContact() {
		PersonContactInfo p = new PersonContactInfo('fName1', 'lName1', 'fName1.lName1@hotmail.com', 'flName1 lName1', '123-456-790')
		personContactInfoDao.delete(p)
	}*/
	
	@Test
	public void getContactList() {
		println personContactInfoDao.list()
	}
	
}
