package service.impl;

import dao.impl.UserDaoImpl;
import dao.interfaces.UserDao;
import entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;
import service.interfaces.ServiceUser;

import java.io.Serializable;


@Service
public class ServiceUserImpl implements ServiceUser , Serializable {


    @Autowired
    UserDaoImpl userDaoImpl ;

    public String saveUser(Users user) {

        if(userDaoImpl.saveUser(user)){
            return "true";
        }else{
            return "false";
        }


    }

    public void deleteUser(Users user) {
        userDaoImpl.deleteUser(user);
    }

    public void changeUser(Users user) {
        userDaoImpl.changeUser(user);
    }


    public String checkUserPassword(Users user) {



        if (userDaoImpl.checkUserPassword(user)){
            return "true";
        }else{
            return "false";
        }




    }
}
