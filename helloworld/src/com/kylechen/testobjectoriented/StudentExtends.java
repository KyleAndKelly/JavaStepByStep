package com.kylechen.testobjectoriented;


public class StudentExtends extends  People {
    int grade;

    public StudentExtends(){}
    public StudentExtends(int grade) {
        this("kelly",26,grade);
    }
    public StudentExtends(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public StudentExtends(String name){
        setName(name);
    }
    public void printName(){
        System.out.println(name);
        System.out.println(getName());
    }
    public void printGrade(){
        System.out.println(grade);
    }
    @Override
    public void printProperty(){
        System.out.println("now in class Student ");
    }


    public void testSuper(){
        printProperty();
        super.printProperty();
    }
    public void printRole(){
        System.out.println("I am a Student");
    }
}
