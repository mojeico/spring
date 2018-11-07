package controller;


import javafx.scene.shape.Path;
import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.ServletContextResourcePatternResolver;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public final class HelloController {


    User user;
    ArrayList<User> list ;

    {
        list = new ArrayList<User>();


        list.add(new User("Gleb" , "Mojeico" , "Moldova" , "g.m@gmail.com" , "gm", "imageName"));



    }


    @RequestMapping(value = "/users/{lastname}" )
    public String showUser(@PathVariable String lastname, Model model) throws IOException {
        System.out.println("controller showUser");
        model.addAttribute("users", list );
        model.addAttribute("username", lastname );
        return "users";
    }







    @RequestMapping(value = "/form" , method = RequestMethod.GET)
    public String getForm() {
        return "form";
    }


    @RequestMapping(value = "/form" , method = RequestMethod.POST)
    public String form(@RequestParam ("firstname") String firstname,
                       @RequestParam ("lastname") String lastname,
                       @RequestParam ("city") String city,
                       @RequestParam ("email") String email,
                       @RequestParam ("password") String password/*,
                       @RequestParam("file") MultipartFile file*/) throws IOException {

       // User user = new User(firstname,lastname,city,email,password, saveFile(file).getName());
        User user = new User(firstname,lastname,city,email,password, "TestName");
        list.add(user);

        System.out.println(firstname +" " + password);
        return "redirect:/users/" + lastname;
    }


        public File saveFile(MultipartFile file ) throws IOException {
            String name = null;
            byte[] bytes = new byte[0];
            bytes = file.getBytes();
            name = file.getOriginalFilename();
            File file1 = new File("");
            File uploadedFile = new File(file1.getAbsolutePath() + "\\resource\\" + name);
            System.out.println(uploadedFile.getAbsolutePath());
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
            stream.write(bytes);
            stream.flush();
            stream.close();
            return uploadedFile;

        }








}