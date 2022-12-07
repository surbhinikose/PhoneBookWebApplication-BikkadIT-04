package com.BikkadIT.PhoneBookWebApplication.service;

import java.util.List;

import com.BikkadIT.PhoneBookWebApplication.entities.Contact;

public interface ContactServiceI 
{
public abstract boolean saveContact(Contact contact);

public abstract List<Contact> getAllContact();
}
