package model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class User {


        String firstname;
        String lastname;
        String city;
        String email;
        String password;
        String filename;



    public User(String firstname, String lastname, String city, String email, String password, String filename) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.email = email;
        this.password = password;
        this.filename = filename;


        //test

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFilename() { return filename; }



}
