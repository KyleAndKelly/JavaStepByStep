package com.kylechen.testapi;

public class UserDefinedException extends RuntimeException {
    public UserDefinedException(){};
    public UserDefinedException(String message) {
        super(message);
    }
}
