package com.kylechen.testobjectoriented;

public class TestObjectOriented {
    public static  final String SCHOOL_NAME = "ShenZhen Middle School";
    public static void main(String[] args) {
//        //1. test basic class
//        System.out.println("Test basic class");
//        StudentBasic s1 = new StudentBasic();
//        System.out.println(s1.age);
//        System.out.println(s1.name);
//
//        s1.age = 10;
//        s1.name="kyle";
//        System.out.println(s1.age);
//        System.out.println(s1.name);
//
//        s1.printThis();
//        s1.isMiddleSchool(12);
//
//        StudentBasic s2 = new StudentBasic(17,"kelly");
//        System.out.println(s2.age);
//        System.out.println(s2.name);
//
//        //2. test entity class
//        System.out.println("Test entity class");
//        StudentEntity s3 = new StudentEntity();
//        s3.setAge(19);
//        s3.setName("kat");
//        StudentOperator sp = new StudentOperator(s3);
//        sp.isMiddleSchool(12);
//
//        //3. test static
//        System.out.println(StudentBasic.schoolName);
//        StudentBasic.printSchoolName();
//
//        //4.test extends/polymorphism
//        StudentExtends s4 = new StudentExtends("sid");
//        s4.printName();
//        System.out.println(s4.getName());
//        s4.printProperty();
//        s4.testSuper();
//
//        StudentExtends s5 = new StudentExtends("sid",13,567);
//        s5.printName();
//        StudentExtends s6 = new StudentExtends(567);
//        s6.printName();
//
//        People p1 = s6;
//        p1.printProperty();
//        if(p1 instanceof StudentExtends){
//            StudentExtends s7 = (StudentExtends) p1;
//            s7.printGrade();
//            s7.printRole();
//        }
//
//        //5. test final
//        System.out.println(SCHOOL_NAME);

//        //6. test inner class
//        StudentBasic.InnerClass in1 = new StudentBasic().new InnerClass();
//        in1.testInner();
//
//        StudentBasic.StaticInnerClass in2 = new StudentBasic.StaticInnerClass();
//        in2.testInner();
//
//        People p2 = new People() {
//            @Override
//            public void printRole() {
//                System.out.println("I am a inner class");
//            }
//        };
//        p2.printRole();
//
//        testPeople(new People() {
//            @Override
//            public void printRole() {
//                System.out.println("I am a function  parameter");
//            }
//        });
        //7. test enum
//        StudentBasic s8 = new StudentBasic();
//        s8.setStatus(StudentStatus.EAT);
//        s8.checkStatus();

    }

    public static void testPeople(People p){
        p.printRole();
    }
}
