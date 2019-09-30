package com.gda.spring.students.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
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
}
