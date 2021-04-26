package com.feige;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/26 10:44
 */
public class Courier extends Preson{
    private String courierId ;
    public Courier(){
    }
    public Courier(String courierId,String pwd){
        super.setPwd(pwd);
        this.courierId = courierId ;
    }
    public Courier(String courierId,String name,String sex,int age ,String pwd){
        super(name, age, pwd, sex);
        this.courierId = courierId ;
    }

    public String getCourierId() {
        return courierId;
    }

    public void setCourierId(String courierId) {
        this.courierId = courierId;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "courierId='" + courierId + '\'' +
                "Pwd='" + getPwd() + '\'' +
                "Name='" +getName() + '\'' +
                "Ssx='" + getSex() + '\'' +
                "Age='" + getAge() + '\'' +
                '}';
    }
}
