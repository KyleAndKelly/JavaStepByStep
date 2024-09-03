package com.kylechen.testtemplate;

public class TemplateInterface implements Tem<Integer> {
    Integer id;
    @Override
    public void setID(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getID() {
        return this.id;
    }
}

interface  Tem<T>{
    void setID(T id);
    T getID();
}