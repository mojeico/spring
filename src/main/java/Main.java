
import dao.impl.UserDaoImpl;
import entities.Users;
import model.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[ ]) {





        Users user = new Users();
        user.setId("2");

        user.setLogin("loginHib2");
        user.setPassword("passHib2");



        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf-spring.xml");

        UserDaoImpl userDaoImpl = (UserDaoImpl) applicationContext.getBean("userDaoImpl");

        userDaoImpl.saveUser(user);







    }

}
