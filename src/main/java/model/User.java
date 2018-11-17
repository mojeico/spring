package model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;


@Component
public class User implements Serializable {


        String firstname;
        String lastname;
       /* String city;
        String email;
        String password;
        String filename;
*/


    /*
    public User(String firstname, String lastname, String city, String email, String password, String filename) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.email = email;
        this.password = password;
        this.filename = filename;
    }*/


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

   /* public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFilename() { return filename; }*/


    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                /*", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", filename='" + filename + '\'' +*/
                '}';
    }



}
