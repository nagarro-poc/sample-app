package com.test.logee;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("App -2 : Welcome home Page " + localDateTime);
        return "Welcome to Home page";
    }

    @GetMapping("/logs")
    public String logsPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("App -2 : This Logs page " + localDateTime);
        return "Welcome to logs page";
    }

    @GetMapping("/warn")
    public String warnPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.warn("App -2 : This warn page " + localDateTime);
        return "Welcome to warn page";
    }


    @GetMapping("/er")
    public String errorPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.error("App -2 : This error page " + localDateTime);
        return "Welcome to error page";
    }


}
