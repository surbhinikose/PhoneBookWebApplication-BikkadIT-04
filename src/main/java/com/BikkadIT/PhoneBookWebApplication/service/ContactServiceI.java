package com.BikkadIT.PhoneBookWebApplication.service;

import java.util.List;

import com.BikkadIT.PhoneBookWebApplication.entities.Contact;

public interface ContactServiceI 
{
public abstract boolean saveContact(Contact contact);

public abstract List<Contact> getAllContact();

public abstract  Contact getContactById(Integer id);

public abstract boolean updateContact(Contact contact);

public abstract boolean deleteContactById(Integer id);
}
