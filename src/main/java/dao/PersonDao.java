package dao;

import entities.Person;
import exceptions.PersonException;

public interface PersonDao {
	
	Person addPerson(Person person) throws PersonException;
	
	Person findPersonById(int id) throws PersonException;
	
	Person deletePerson(int id) throws PersonException;

}
