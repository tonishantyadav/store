package com.nishant.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return getViewName();
    }

    private String getViewName() {
        return "index.html";
    }
}
