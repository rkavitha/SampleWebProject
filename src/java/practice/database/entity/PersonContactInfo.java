package practice.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author Kavitha R
 *
 */
@Entity
@Table(name="PERSON_CONTACT_INFO")
public class PersonContactInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3803727456084151465L;

	@Id
	@Column(name="PERSON_CONTACT_INFO_ID", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
	@SequenceGenerator(name="author_generator", sequenceName = "PERSON_CONTACT_INFO_ID_SEQ")
	private int personContactInfoId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="FULL_NAME")
	private String fullName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	

	public int getPersonContactInfoId() {
		return personContactInfoId;
	}



	public void setPersonContactInfoId(int personContactInfoId) {
		this.personContactInfoId = personContactInfoId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("Id = " + personContactInfoId);
		strBuff.append("Full Name = " + fullName);
		return strBuff.toString();
	}
	
	
}
