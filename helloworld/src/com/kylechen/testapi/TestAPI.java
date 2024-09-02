package com.kylechen.testapi;

import java.io.IOException;

public class TestAPI {
    public static void main(String[] args) {
        //1.String
        String s1 = "kyle";
        String s2 =new String("kyle");

        char[] c = {'k','y'};
        String s3 = new String(c);

        byte[]  b = {97, 98, 99};
        String s4 = new String(b);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s1.equals(s2));
        System.out.println(s1.substring(0,1));
        System.out.println(s1.contains("k"));
        System.out.println(s1.startsWith("k"));
        System.out.println(s1.replace("le","lain"));
        System.out.println(s1.split("y"));

        //2. exception
        try{
            testException1(0);
            testException2(0);
            testException3();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException has been catched");
        } catch (IOException e) {
            System.out.println("IOException has been catched");
        } catch (UserDefinedException e) {
            System.out.println("UserDefinedException has been catched");
        }finally {
            System.out.println("finally statement has been executed");
        }

    }

    public static void testException1(int num) throws ArithmeticException {
        System.out.println(3/num);
    }

    public static void testException2(int num) throws IOException  {
            throw new IOException("IO exception occured");
    }

    public static void testException3() throws UserDefinedException  {
        throw new UserDefinedException("UserDefined exception occured");
    }
}
