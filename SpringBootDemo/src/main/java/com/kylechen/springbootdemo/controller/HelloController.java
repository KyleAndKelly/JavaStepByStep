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

    @RequestMapping(value = "/testResultObject")
    public Result resultObjectTest(){
        return new Result(0,"success",null);
    }

    @RequestMapping("/testResultObject1")
    public Result resultObjectTest1(){
        return Result.failed(null);
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

class Result{
    private Integer code;
    private String msg;
    private Object data;
    public  Result(){};
    public  Result(Integer code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public  static  Result success(Object data){
        return new Result(0,"success",data);
    }
    public  static  Result failed(Object data){
        return new Result(1,"failed",data);
    }
}

