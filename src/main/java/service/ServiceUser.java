package service;

import model.User;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;

@Component
public class ServiceUser implements Serializable {


    static ArrayList<User> list = new ArrayList<User>();





    public void saveUser(User user){
        list.add(user);
        System.out.println(user.getLogin() +  "   " + user.getLogin());

        for(User userlist: list){
            System.out.println(userlist.toString());
        }


    }



    public String checkLogin(User user){

        for(User userlist: list){


            boolean bul = user.getLogin().equals(userlist.getLogin()) && user.getPassword().equals(userlist.getPassword());

            if(bul){
                return "true";
            }
        }
        return "false";
    }









}
