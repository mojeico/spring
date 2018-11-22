package dao.impl;

import dao.interfaces.UserDao;
import entities.Users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.ArrayList;


@Repository
public class UserDaoImpl implements UserDao , Serializable {



    SessionFactory sessionFactory;


    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

    }



    public Users getUser(Users user) {



        Session s = sessionFactory.openSession();
        s.getTransaction().begin();
        Users users = s.find(Users.class, user.getId());
        s.getTransaction().commit();
        return  users;

    }



    public boolean saveUser(Users user) {



        Session s = sessionFactory.openSession();
        s.getTransaction().begin();



        boolean haveUser = this.checkUserPresence(user);
        if (haveUser == true){
            s.save(user);
            s.getTransaction().commit();
            return true;
        }else{
            s.close();
        }

        return false;









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
        users.setLogin(user.getLogin());
        user.setPassword(user.getPassword());
        s.update(users);

        s.getTransaction().commit();

    }


    public boolean checkUserPassword(Users user){
        Session s = sessionFactory.openSession();
        Query query = s.createQuery("select login from Users where login = :login ");
        query.setParameter("login", user.getLogin());

        ArrayList<Users> list = (ArrayList<Users>) query.list();

        System.out.println(user.toString());



        Users userPas = list.get(0);

        System.out.println(userPas.toString());


            if (userPas.getPassword() == user.getPassword()){
              return true;
            }else{
                return false;
            }


    }




    public boolean checkUserPresence(Users user){
        Session s = sessionFactory.openSession();
        Query query = s.createQuery("select login from Users where login = :login ");
        query.setParameter("login", user.getLogin());




        ArrayList<Users> list = (ArrayList<Users>) query.list();



        if(list.size() == 0){

            return true;
        }
        System.out.println(false);
       return false;





    }



}
