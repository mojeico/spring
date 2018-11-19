import dao.Test;
import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[ ]) {



        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf-spring.xml");

        Test test = (Test) applicationContext.getBean("test");

        //daoUser.saveUser(user);


        test.show();




    }

}
