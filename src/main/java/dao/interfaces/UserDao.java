package dao.interfaces;

import entities.Users;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserDao {


      Session currentSession();
     void getUser(User user);
     void saveUser(User user);
     void deleteUser(User user);
     void changeUser(User user);
}
