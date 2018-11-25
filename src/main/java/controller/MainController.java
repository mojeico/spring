package controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


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
    public String home() {
        return "home";
    }


    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public String anon() {
        return "admin";
    }


    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String user() {
        return "user";
    }


}
