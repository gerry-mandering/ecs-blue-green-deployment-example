package com.example.ecsdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${test-value}")
    private String testValue;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "This is Green Deployment! " + testValue;
    }
}
