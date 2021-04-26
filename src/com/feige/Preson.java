package com.feige;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/26 10:12
 */
public class Preson {
    private String pwd ;
    private String sex ;
    private  int age ;
    private String name ;
    public Preson(){
    }
    public Preson(String name,int age , String pwd , String sex){
        this.age = age ;
        this.pwd = pwd ;
        this.sex = sex ;
        this.name = name ;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
