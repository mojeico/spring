
import dao.impl.UserDaoImpl;
import entities.Users;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Main {
    public static void main(String args[ ]) {






        Users user = new Users();


        user.setUsername("andrie");



        user.setPassword("a123");







        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf-spring.xml");

        UserDaoImpl userDaoImpl = (UserDaoImpl) applicationContext.getBean("userDaoImpl");


        userDaoImpl.saveUser(user);






/*
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode("gleb");


        System.out.println(hashedPassword);*/

    }

}
