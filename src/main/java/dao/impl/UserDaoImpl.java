package dao.impl;

import dao.HibernateUtil;
import dao.interfaces.UserDao;
import entities.Users;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {



    SessionFactory sessionFactory;
    Session sess;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

    }



    public Session currentSession() {
        return sessionFactory.getCurrentSession();

    }




    public void getUser(User user) {

    }

    public void saveUser(Users user) {


/*

        Session s = sessionFactory.openSession();
        s.getTransaction().begin();
        s.save(user);
*/



        Session s = sessionFactory.openSession();
        s.getTransaction().begin();
        s.persist(user);
        s.getTransaction().commit();


    }

    public void deleteUser(User user) {

    }

    public void changeUser(User user) {

    }
}
