package dao.impl;

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


    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

    }



    public Session currentSession() {
        return sessionFactory.getCurrentSession();

    }




    public void getUser(Users user) {

        Session s = sessionFactory.openSession();
        s.getTransaction().begin();
        s.find(Users.class, user.getId());
        s.getTransaction().commit();


    }

    public void saveUser(Users user) {




        Session s = sessionFactory.openSession();
        s.getTransaction().begin();
        s.save(user);
        s.getTransaction().commit();


    }

    public void deleteUser(Users user) {

    }

    public void changeUser(Users user) {

    }
}
