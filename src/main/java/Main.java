
import dao.impl.UserDaoImpl;
import entities.Users;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[ ]) {





        Users user = new Users();


        user.setLogin("anna");
        user.setPassword("123");




        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf-spring.xml");

        UserDaoImpl userDaoImpl = (UserDaoImpl) applicationContext.getBean("userDaoImpl");


        userDaoImpl.checkUserPassword(user);









    }

}
