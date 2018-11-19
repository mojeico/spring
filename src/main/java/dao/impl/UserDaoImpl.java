package dao.impl;

import dao.HibernateUtils;
import dao.interfaces.UserDao;
import entities.Users;
import model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.transaction.internal.TransactionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {



    SessionFactory sessionFactory;
    Session sess;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

         sess = HibernateUtils.getSessionFactory().openSession();
    }



    public Session currentSession() {
        return sessionFactory.getCurrentSession();

    }




    public void getUser(User user) {

    }

    public void saveUser(User user) {



        //currentSession().save(user);

        //sess.save(user);



    }

    public void deleteUser(User user) {

    }

    public void changeUser(User user) {

    }
}
