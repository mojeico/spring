
import dao.HibernateUtils;
import dao.impl.UserDaoImpl;
import entities.Users;
import model.User;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[ ]) {





        User user = new User();

        user.setLogin("loginHib");
        user.setPassword("passHib");



        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf-spring.xml");

        UserDaoImpl userDaoImpl = (UserDaoImpl) applicationContext.getBean("userDaoImpl");

        userDaoImpl.saveUser(user);







    }

}
