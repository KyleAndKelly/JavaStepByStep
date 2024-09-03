package com.kylechen.testobjectoriented;

public class StudentBasic {
    static String schoolName;
    static void printSchoolName (){
        System.out.println(schoolName);
    }
    static {
        System.out.println("Static block has been executed");
        String schoolName = "ShangRao School ";
    }

    {
        System.out.println("Instance block has been executed");
    }
    String name;
    int age;

    public StudentBasic(){}

    public StudentBasic(int age , String name){
        this.age = age ;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printThis() {
        System.out.println(this);
    }

    void isMiddleSchool(int age) {
        if(this.age < age ){
            System.out.println("Not Middle School Student");
        }else{
            System.out.println("Is Middle School Student");
        }
    }

    //Inner class
    public class InnerClass{
        int height = 168;
        public void testInner(){
            System.out.println("now in inner class");
        }

    }

    public static class StaticInnerClass{
        int height = 168;
        public void testInner(){
            System.out.println("now in static inner class");
        }

    }

    StudentStatus status;
    public void setStatus(StudentStatus status) {
        this.status = status;
    }
    public void checkStatus() {
        switch (this.status){
            case EAT:
                System.out.println("EAT");
                break;
            case PLAY:
                System.out.println("PLAY");
                break;
            case SLEEP:
                System.out.println("SLEEP");
                break;
            case STUDY:
                System.out.println("STUDY");
                break;
            default:
                System.out.println("UNKNOWN");
                break;
        }

    }
};

enum StudentStatus{
    SLEEP,
    EAT,
    STUDY,
    PLAY;
}
