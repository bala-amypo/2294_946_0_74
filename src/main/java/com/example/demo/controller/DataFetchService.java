package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DataFetchService;

@RestController                    //contoller layer annotation to tell that the demo has the controller
public class DataFetchController {

    @Autowired
    DataFetchService ser;
   
    @GetMapping("/fetchdata")
    public String fetchData(){
        return ser.fetchData();
    }
}