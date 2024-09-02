package com.kylechen.testtemplate;

public class TestTemplate {
    public static void main(String[] args) {
        //1. test template class
        TemplateClass<Integer> t1 = new TemplateClass<>();
        t1.setId(5);
        System.out.println(t1.getId());

        //2.test template interface
        TemplateInterface t2 =new TemplateInterface();
        t2.setID(6);
        System.out.println(t2.getID());

        //3.test template function
        System.out.println(test(7));
    }

    public static <T> T test(T t){
        return t;
    }
}
