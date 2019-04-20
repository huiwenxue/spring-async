package com.springmvc.async;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String blog;
    private Integer age;
	private Integer height;
	private Integer number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", blog='" + blog + '\'' +
                ", age=" + age +
                '}';
    }
}
