package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class TopicController {

    public static void main(String args[]) {
        System.out.println("Sagar");
    }



        @RequestMapping("/Topics")
        public String getAllTopics() {
            return "hii Sagar";
        }

}
