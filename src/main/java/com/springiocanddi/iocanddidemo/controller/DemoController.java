package com.springiocanddi.iocanddidemo.controller;

import com.springiocanddi.iocanddidemo.impl.DemoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//DI Types : a) Constructor Based b) Setter Method based

@RestController
public class DemoController {

    @Autowired  //provides spring's dependency injection facilities
    private DemoImpl demoImpl;  //field based DI

    public DemoController(DemoImpl demoImpl){
        System.out.println("Hiiiiiiiiiiii");
        this.demoImpl=demoImpl;
        System.out.println("Helllooooooooo");
    }

//    @Autowired
//    public void setDemoImpl(DemoImpl demoImpl) {
//        this.demoImpl = demoImpl;
//    }

    @GetMapping(value="/check")
    public String getData(){
        return demoImpl.checkIocAndDi();
    }
}
