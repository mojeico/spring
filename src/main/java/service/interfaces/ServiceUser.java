package service.interfaces;

import dao.interfaces.UserDao;
import entities.Users;

public interface ServiceUser  {

    String saveUser(Users user);
    void deleteUser(Users user);
    void changeUser(Users user);
    String checkUserPassword(Users user);


}
