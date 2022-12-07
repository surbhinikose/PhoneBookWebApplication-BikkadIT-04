package com.BikkadIT.PhoneBookWebApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.PhoneBookWebApplication.entities.Contact;
import com.BikkadIT.PhoneBookWebApplication.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactServiceI
{
   @Autowired
	private ContactRepository contactRepository;
	
	@Override
	public boolean saveContact(Contact contact) {
		
		Contact Contact2 = contactRepository.save(contact);
		
		if(Contact2 !=null)
		{
			
			return true;
		}
		else
			
		return false;
	}

	@Override
	public List<Contact> getAllContact()
	{
		List<Contact> list = contactRepository.findAll();
		return list;
	}

}
