package edu.dl.project01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeController {
    @RequestMapping("/")
    public String home(){
        log.info("log info: home controller");
        return "home"; //home.html 호출
    }
}
