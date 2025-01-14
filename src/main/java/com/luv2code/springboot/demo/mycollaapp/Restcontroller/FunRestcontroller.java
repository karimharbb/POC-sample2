package com.luv2code.springboot.demo.mycollaapp.Restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController 

public class FunRestcontroller {
    @GetMapping("/")
    public String sayhello(){
        return "Hello world !";
    }

    @Value("${coach.name}")
    private String coachName ;

    @Value ("${team.name}")
    private String teamName ;


@GetMapping("/teaminfo")
public String getinfo(){
    return  "coach name is " + coachName +" team name is "+ teamName;
    }


    @GetMapping("/workout")
    public String dailyworkout(){
        return "you daily work put is done";
    }
}
