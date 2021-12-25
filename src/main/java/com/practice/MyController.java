package com.practice;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@SpringBootApplication
@Controller
public class MyController {
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {
        System.out.println("Inside about handler......");
        //putting data in model
        model.addAttribute("name", "Vishal");
        model.addAttribute("currentDate", "new Date().toLocaleString()");
        String nameString = "abc";
        nameString.toUpperCase();
        return "about";
        //about.html
    }
    //handling iteration
    @GetMapping("/example-loop")
    public String iterationHandler(Model m){
        //send

        //create a list, set collection

        List<String> names=List.of("Vishal","abhishek","rakesh");

        m.addAttribute("names",names);

        return "Iterate";
    }
}