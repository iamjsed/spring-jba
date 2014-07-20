package com.iamjsed.jba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by iamjsed on 7/20/2014.
 */
@Controller

public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
