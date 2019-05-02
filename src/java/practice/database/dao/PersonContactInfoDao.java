package practice.database.dao;

import java.util.List;

import practice.database.entity.PersonContactInfo;

/**
 * 
 * @author Kavitha R
 *
 */
public interface PersonContactInfoDao {
    
	public void save(PersonContactInfo p);
	
	public void update(PersonContactInfo p);
	
	public void delete(PersonContactInfo p);
	
	public List<PersonContactInfo> list();
}
