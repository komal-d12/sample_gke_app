package com.google.sample.gke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/samplegkeapp")
public class GkeController {

    @Autowired
    GkeService gkeService;

    @GetMapping("/greet")
    public String greet() {
        return gkeService.greet();
    }
}
