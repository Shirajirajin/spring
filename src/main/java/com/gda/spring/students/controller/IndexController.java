package com.gda.spring.students.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping (path = "/demo/") //wszystko bedzie wymagalo poczatku loclalhost8082/DEMO

public class IndexController {
    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String wyswietlMojaStroneHelloWordWSpringu() {
        return "strona-hello";
    }
/*
mozna nieskonczenie wiele req Get dodac

    @RequestMapping(path = "/index2", method = RequestMethod.GET)
    public String wyswietlMojaStroneHelloWordWSpringu2() {
        return "strona-hello";
    }
*/

/*alternatywa*/
    @GetMapping("/hello")
    public String wyswietlHello() {
        return "strona-hello";
    }

    @GetMapping("/helloTo") // helloTo?imie="cos"
    public String wyswietlHelloTo(Model model,
                                  @RequestParam(name = "imie", required = false) String prarametrImie) {
        model.addAttribute ("atrybutImie", prarametrImie);
        return "strona-hello-to";
    }

    /*druga wersja*/

    @GetMapping("/helloMyBaby/{babyName}")
    public String wyswietlHelloToBaby (Model model,
                                       @PathVariable (name="babyName", required = false) String variable){
        model.addAttribute( "atrybutImie", variable);
        return "strona-hello-to";
    }
}
