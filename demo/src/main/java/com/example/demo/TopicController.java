package com.example.demo;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class TopicController {



    @RequestMapping("/Topics")
        public List<Topics> getAllTopics() {
            return Arrays.asList(
                    new Topics("spring","spring framework","spring framework description"),
                    new Topics("java","core java","core java description"),
                    new Topics("javascript","javascript","javascript description")



                    );
        }

}
