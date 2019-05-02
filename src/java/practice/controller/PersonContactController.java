package practice.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import practice.service.PersonContactService;

/**
 * 
 * @author Kavitha R
 *
 */
@Controller
public class PersonContactController {

	@Autowired
	private PersonContactService personContactService;
	
	private static Logger logger = LogManager.getLogger(PersonContactController.class);
	
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	@ResponseBody
	public String addContact(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, 
			@RequestParam("email") String email, @RequestParam("phoneNumber") String phoneNumber, Model model) {
		
		logger.info("logger Name: " + logger.getName());
		logger.info("Received Contact Info. FirstName: " + firstName);
		
		String fullName = personContactService.appendFirstAndLastNames(firstName, lastName);
		logger.info("Full Name: " + fullName);
		
		personContactService.saveContact(firstName, lastName, fullName, email, phoneNumber);
		logger.info("Saved Contact for: " + fullName);
		
		return "SavedContact for: " + fullName;
	}
	
	@RequestMapping(value = "/getContact", method = RequestMethod.GET)
	@ResponseBody
	public String getContact() {
		return "Via REST Call : " + "Sample Contact Info";
	}
}
