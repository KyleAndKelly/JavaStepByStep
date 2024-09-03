package com.kylechen.testinterface;

public class C implements InterfaceA,InterfaceB {
    @Override
    public void testA() {
        System.out.println("now in testA");
    }

    @Override
    public void testB() {
        System.out.println("now in testB");
    }
}
