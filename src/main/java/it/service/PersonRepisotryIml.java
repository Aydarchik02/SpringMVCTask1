package it.service;

import it.model.Person;
import it.repository.PersonRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonRepisotryIml implements PersonRepository {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Person user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Override
    public void deleteById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.get(Person.class, id));
    }

    @Override
    public Person findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Person.class, id);
    }

    @Override
    public List<Person> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select p from Person p", Person.class).getResultList();
    }


    @Override
    public void update(Person user, Long id) {
        Session session = sessionFactory.getCurrentSession();
        Person user1 = session.get(Person.class, id);
        user1.setName(user.getName());
        user1.setAge(user.getAge());
        session.merge(user1);
    }

}