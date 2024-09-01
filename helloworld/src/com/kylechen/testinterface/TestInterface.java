package com.kylechen.testinterface;

public class TestInterface {
    public static void main(String[] args) {
        System.out.println(InterfaceA.INTERFACE_NAME);
        System.out.println(InterfaceB.INTERFACE_NAME);

        C c = new C();
        c.testA();
        c.testB();
    }
}
