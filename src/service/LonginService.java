package service;

import com.feige.Customer;

import java.util.Scanner;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/26 9:22
 */
public class LonginService {
    private Scanner sc = null ;
    public LonginService(Scanner scanner){
        this.sc = scanner ;
    }
    //注册
    public void register(Scanner sc){
        System.out.println("请输入用户编号");
        String bianhao = sc.next() ;
        System.out.println("请输入用户密码");
        String pwd = sc.next() ;
        System.out.println("亲输入用户名");
        String name = sc.next() ;
        System.out.println("亲输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入手机号");
        String phone = sc.next() ;
        System.out.println("请输入性别");
        String sex = sc.next() ;
        Customer customer = Customer.builder().setCustomerId(bianhao).Pwd(pwd);
    }
}
