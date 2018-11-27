package dao.interfaces;

import entities.Users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;

public interface UserDao {


     //@Secured("{ROLE_ADMIN}")
     Users getUser(Users user);
     boolean saveUser(Users user);
     void deleteUser(Users user);
     void changeUser(Users user);
     boolean checkUserPresence(Users user);
}
