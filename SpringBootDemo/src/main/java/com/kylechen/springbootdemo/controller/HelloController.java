package com.kylechen.springbootdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello world");
        return "hello world";
    }

    @RequestMapping("/simpleParamTest")
    public String simpleParamTest(@RequestParam( name = "",required = true) String name, Integer age){
        System.out.println(name+":"+age);
        return name+":"+age;
    }



    @RequestMapping("/pojoParamTest")
    public String pojoParamTest(@RequestBody  Ueser user){
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.add.city);
        System.out.println(user.add.street);
        return "OK";
    }

    @RequestMapping("/path/{id}/{name}")
    public String pathParamTest(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id+":"+name);
        return "OK";
    }


}

class Ueser{
    public String name;
    public Integer age;
    public Address add;

}
class Address{
    public String city;
    public String street;
}
