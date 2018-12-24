package com.atguigu.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class dem2Test {

    @Controller
    public class IndexController {

        @RequestMapping("/index")
        @ResponseBody
        public String Index(){
            return "index";
        }

    }
        @RequestMapping("/index")
        @ResponseBody
        public String Index(){
            return "你是谁啊，你在哈";
        }


}
