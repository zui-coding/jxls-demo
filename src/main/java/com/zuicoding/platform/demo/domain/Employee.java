package com.zuicoding.platform.demo.domain;

import java.io.Serializable;

/**
 * Created by Stephen.lin on 2017/9/6.
 * <p>
 * Description :<p></p>
 */
public class Employee implements Serializable{

    private static final long serialVersionUID = -8254134768011904133L;
    private int id;
    private String name;
    private int age;
    private String address;
    private String tel;

    public Employee() {
    }

    public Employee(int id, String name, int age, String address, String tel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
