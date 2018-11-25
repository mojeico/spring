package controller;



import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;


@Controller
public class MainController {



    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error) {

        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username or password!");
        }
        model.setViewName("login");
        return model;
    }



    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(Principal principal) {
        System.out.println(printUserDetailsl().getPassword());
        System.out.println(printUserDetailsl().getUsername());
        System.out.println(printUserDetailsl().getAuthorities());


        System.out.println("-----------");

        System.out.println(   principal.getName());
        return "home";
    }


    @RequestMapping(value = "/setting",method = RequestMethod.GET)
    public String setting() {
        return "setting";
    }


    @RequestMapping(value = "/account",method = RequestMethod.GET)
    public String account() {
        return "account";
    }

    @RequestMapping(value = "/accessDenied",method = RequestMethod.GET)
    public ModelAndView accessDenied(Principal user) {

        ModelAndView model = new ModelAndView();

        if (user != null){
            model.addObject("message" , user.getName() + " у вас не доступа");
        }else {
            model.addObject("message" ,  "У вас не доступа");
        }


        model.setViewName("accessDenied");


        return model;
    }







    public UserDetails printUserDetailsl(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetails;
    }



}
