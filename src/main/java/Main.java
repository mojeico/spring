import dao.DaoUser;
import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String args[ ]) {

        User user = new User();
        user.setLogin("gleb");
        user.setPassword("newPass");



        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf-spring.xml");

        DaoUser daoUser = (DaoUser) applicationContext.getBean("daoUser");

        //daoUser.saveUser(user);

        daoUser.showUserJdbc(user);




    }

}
