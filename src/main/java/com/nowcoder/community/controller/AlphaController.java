package com.nowcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/alpha")
public class AlphaController {

    @RequestMapping(path="/teacher")
    @ResponseBody
    public String getStudent(){
        return "success";
    }

    @RequestMapping("/param")
    public ModelAndView getParam(@RequestParam(value = "name",required = false,defaultValue = "jerry")String name,@RequestParam(value = "age",required = false,defaultValue = "30")int age){
        ModelAndView mav=new ModelAndView();
        mav.addObject("name",name);
        mav.addObject("age",age);
        mav.setViewName("/view");
        return mav;
    }

    @RequestMapping("/param/{name}")
    public ModelAndView getParam(@PathVariable String name){
        ModelAndView mav=new ModelAndView();
        mav.addObject("name",name);
//        mav.addObject("age",age);
        mav.setViewName("/view");
        return mav;
    }
}
