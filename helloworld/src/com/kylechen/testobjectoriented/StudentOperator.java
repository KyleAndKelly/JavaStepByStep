package com.kylechen.testobjectoriented;

public class StudentOperator {

    private  StudentEntity s;
    public StudentOperator(StudentEntity s){
        this.s = s;
    }
    void isMiddleSchool(int age) {
        if(s.getAge() < age ){
            System.out.println("Not Middle School Student");
        }else{
            System.out.println("Is Middle School Student");
        }
    }
}
