package dao.interfaces;

import entities.Users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserDao {



     Users getUser(Users user);
     boolean saveUser(Users user);
     void deleteUser(Users user);
     void changeUser(Users user);
     boolean checkUserPresence(Users user);
}
