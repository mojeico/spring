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








    public void saveUser(Users user) {
        Session s = sessionFactory.openSession();
        s.getTransaction().begin();
        s.save(user);
        s.getTransaction().commit();


    }



    public Users getUser(Users user) {

        Session s = sessionFactory.openSession();
        s.getTransaction().begin();
        Users users = s.find(Users.class, user.getId());

        s.getTransaction().commit();




        return  users;

    }




    public void deleteUser(Users user) {
        Session s = sessionFactory.openSession();
        s.getTransaction().begin();
        s.delete(user);
        s.getTransaction().commit();

    }





    public void changeUser(Users user) {
        Session s = sessionFactory.openSession();
        s.getTransaction().begin();

        Users users = s.load(Users.class,user.getId());
        users.setLogin("changeLog");
        s.update(users);


        s.getTransaction().commit();

    }





    public boolean checkUser(Users user){
        Users users = this.getUser(user);
        if(users == null){
            System.out.println("false");
            return false;
        }
        System.out.println("true");
        return true;
    }




}
