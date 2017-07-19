package idv.bsh.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lineplus on 2017. 7. 19..
 */

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }
}
