package com.BikkadIT.PhoneBookWebApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.PhoneBookWebApplication.entities.Contact;
@Repository
public interface  ContactRepository extends JpaRepository<Contact,Integer>
{
	
}