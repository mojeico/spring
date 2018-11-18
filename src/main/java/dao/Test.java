package dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {

    @Autowired
    private SessionFactory sessionFactory;



    public void show() {
        System.out.println(sessionFactory.toString());
    }
}
