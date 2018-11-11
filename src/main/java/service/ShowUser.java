package service;


import model.User;
import org.springframework.stereotype.Component;



@Component
public class ShowUser {

    public String show(User user){

        System.out.println(user.getFirstname() + "   " + user.getLastname());

        System.out.println();
        System.out.println(user.toString());

        return "true";

    }


}
