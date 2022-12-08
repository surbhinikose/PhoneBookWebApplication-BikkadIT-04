package com.BikkadIT.PhoneBookWebApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.PhoneBookWebApplication.entities.Contact;
import com.BikkadIT.PhoneBookWebApplication.exception.NoContactFoundException;
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

	@Override
	public Contact getContactById(Integer id) {
		Contact Id2 = contactRepository.findById(id).get();
		if(id !=null)
		{
			return Id2 ;
		}

		 throw new NoContactFoundException();
	}

	@Override
	public boolean updateContact(Contact contact) {
		Contact contact2 = contactRepository.save(contact);
		
		if(contact2 != null)
		{
			return true;
		}
		else
		  return false;
		
	}

	@Override
	public boolean deleteContactById(Integer id) {
	
		boolean existsById = contactRepository.existsById(id);
		
		if(existsById)
		{
		contactRepository.deleteById(id);
		return true;
	   }
		else
		{
			return false;
		}

}
}