package com.feige;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/26 9:15
 */
public class Customer extends Preson{
    private String customerId ;
    private  String phone ;
    public Customer(){
    }

    //   构建器 用来构建一个对象
    public static Customer builder(){
        return new Customer() ;
    }
    public String getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(String customerId) {
        this.customerId = customerId;
        return this ;
    }
    public Customer Pwd(String pwd){
        super.setPwd(pwd);
        return this ;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
