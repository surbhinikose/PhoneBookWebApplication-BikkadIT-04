package com.BikkadIT.PhoneBookWebApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.PhoneBookWebApplication.entities.Contact;
import com.BikkadIT.PhoneBookWebApplication.service.ContactServiceI;

@RestController
public class ContactController 
{
	@Autowired
    private ContactServiceI contactServiceI;
	
	// create
	
	
	@PostMapping(value="/saveContact",consumes="application/json")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact)
	{
		boolean saveContact = contactServiceI.saveContact(contact);
		
		if (saveContact)
		{
	    String mgs ="Contact Saved Successdfully";
			
	    return new ResponseEntity<String>(mgs,HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("Contact Not Save Successfully",HttpStatus.CREATED);
		}
	
	//get all Contact
	
	
	@GetMapping(value="/getAllContact",produces="application/json")
	public ResponseEntity<List<Contact>> getAllContact()
	{
		List<Contact> allContact = contactServiceI.getAllContact();
		return new ResponseEntity<List<Contact>>(allContact,HttpStatus.OK);
		
	}
	
	//getContactById
	@GetMapping(value="/getContactById/{contactId}",produces ="application/json")
	public ResponseEntity<Contact> getContactById(@PathVariable Integer contactId )
	
	{
		Contact contact = contactServiceI.getContactById(contactId);
		
		return new ResponseEntity<Contact>(contact,HttpStatus.OK);
		
	}
	
	//Update Contact
	@PutMapping(value="/updateContact",consumes="application/json")
	public ResponseEntity<String> updateContact(@RequestBody Contact contact)
	{
		boolean updateContact = contactServiceI.updateContact(contact);
		if(updateContact)
		{
		String mgs = "Contact Update Successfully";
		return new ResponseEntity<String>(mgs,HttpStatus.CREATED);
		}
		else
		{
		return new ResponseEntity<String>("Contact Not Update Successfully",HttpStatus.CREATED);
		}
		
	}
		//delete Contact
	
	@DeleteMapping(value="/deleteContactById/{id}")
	public ResponseEntity<String> deleteContactById(@PathVariable Integer id)
	{
	boolean deleteContactById = contactServiceI.deleteContactById(id);
	if(deleteContactById)
	{
		String mgs = "Contact Delete Successfully";
	return new ResponseEntity<String>(mgs,HttpStatus.CREATED);
	}
	else
	{
	return new ResponseEntity<String>("Contact Not Delete Successfully",HttpStatus.CREATED);
	}

}

}