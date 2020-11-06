package com.sinosoft.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping(value = "/hello",method = {RequestMethod.GET})
    public String hello(){
        return "hello --add content";
    }
    //第一次修改，提交并推送到远程Github仓库上。
    //第二次修改，提交并推送到远程Github仓库上。
    //第三次修改，提交并推送到远程Github仓库上。
}
