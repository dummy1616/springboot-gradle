package com.huyueyue.user.controller;


import com.huyueyue.user.entity.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/{id}")
    public Result hello(@PathVariable("id")String id){
        return Result.success("userId:"+id);
    }

}
