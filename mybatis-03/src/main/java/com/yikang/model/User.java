package com.yikang.model;

public class User {
    /*为了测试，这里需要调换属性名顺序且改名*/
    /*这里的顺序是指构造函数的属性名顺序*/
    /*mybatis返回值对java bean进行填充时，若找不到对应属性名，则会按顺序填充*/
    private int id;
    private String nm;
    private String pwd;

    public User(int id, String pwd, String nm) {
        this.id = id;
        this.pwd = pwd;
        this.nm = nm;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nm='" + nm + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
