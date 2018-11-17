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
        System.out.println(user.getFirstname() +  "   " + user.getLastname());

        for(User userlist: list){
            System.out.println(userlist.toString());
        }





    }



    public String checkLogin(User user){





        for(User userlist: list){


            boolean bul = user.getLastname().equals(userlist.getLastname()) && user.getFirstname().equals(userlist.getFirstname());

            if(bul){
                return "true";
            }
        }
        return "false";
    }









}
