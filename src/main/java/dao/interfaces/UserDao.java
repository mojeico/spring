package dao.interfaces;

import entities.Users;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserDao {


      Session currentSession();
     void getUser(Users user);
     void saveUser(Users user);
     void deleteUser(Users user);
     void changeUser(Users user);
}
