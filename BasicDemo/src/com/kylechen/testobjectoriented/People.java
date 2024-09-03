package com.kylechen.testobjectoriented;

public abstract  class People {
    public String name;
    private int age;
    public People() {}
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public void printProperty(){
        System.out.println("now in class People");
    }

    public abstract void printRole();

}
