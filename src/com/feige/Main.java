package com.feige;

import java.util.Scanner;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/26 8:30
 */
public class Main {
    Scanner sc = new Scanner(System.in);
    public Main(){

    }
    public void meau(){
        System.out.println("=======================");
        System.out.println("\t\t欢迎使用快递系统\t\t");
        System.out.println("=======================");
        System.out.println("1 用户注册");
        System.out.println("2 登录系统");
        System.out.println("3 商品查看");
        System.out.println("4 退出系统");
        System.out.println("请输入：");
        int funNo = sc.nextInt();
        switch (funNo){
            case 1:
                // 用户注册
                break;
            case 2:
                // 登录系统
                break;
            case 3:
                // 商品查看
                break;
            case 4:
                // 退出系统
            default:
                sc.close();     //关闭扫描器资源
                System.exit(0); // 0 正常退出 非0 非正常中断退出

        }
    }

    public static void main(String[] args) {
        new Main().meau();
    }
}
