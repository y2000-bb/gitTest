package com.demo.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String name ;
    private String age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
