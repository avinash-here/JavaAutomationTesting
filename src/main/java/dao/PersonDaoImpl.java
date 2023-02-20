package dao;

import entities.Person;
import exceptions.PersonException;
import jakarta.persistence.EntityManager;
import utilities.EMUtil;

public class PersonDaoImpl implements PersonDao{

	@Override
	public Person addPerson(Person person) throws PersonException {
		
		EntityManager em = EMUtil.provideEntityManager();
        
        if(person == null) throw new PersonException();
        
        em.getTransaction().begin();        
        person = em.merge(person);        
        em.getTransaction().commit();
        
        return person;
	}
	

	@Override
	public Person findPersonById(int id) throws PersonException {
		
		EntityManager em = EMUtil.provideEntityManager();
        
        Person person = em.find(Person.class,id);
        
        if(person == null) throw new PersonException();
        
        em.getTransaction().begin();        
        em.remove(person);        
        em.getTransaction().commit();
        
        return person;
	}
	

	@Override
	public Person deletePerson(int id) throws PersonException {
		
		EntityManager em = EMUtil.provideEntityManager();
        
        Person person = em.find(Person.class,id);
        
        if(person == null) throw new PersonException();
        
        return person;
	}

}
