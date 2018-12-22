package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public String Index(){
        return "index";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String Index2(){
        return "我是帅哥";
    }

}
