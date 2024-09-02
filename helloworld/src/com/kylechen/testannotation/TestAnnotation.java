package com.kylechen.testannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class TestAnnotation {
    public static void main(String[] args) {
        try {
            Class<TestAnnotation> clazz = TestAnnotation.class;
            Method[] methods = clazz.getDeclaredMethods();
            for(Method m : methods){
                if(m.isAnnotationPresent(MyAnnotation.class)){
                    MyAnnotation a = m.getAnnotation(MyAnnotation.class);
                    System.out.println(m.getName());
                    System.out.println(a.id());
                    System.out.println(a.name());
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }


    @MyAnnotation(id = 1)
    public void testAnnotation(){
        System.out.println("test annotation");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
    String name() default "defaultName";
    int id() default 0;
}
