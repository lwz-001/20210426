package tools;

import com.feige.Customer;

import java.util.Arrays;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/26 11:15
 */
public class OrderData {
    private static int SIZE = 10;  // 一共能存储的用户数
    private static int COUNT = 0;  // 已经存储的用户
    private static Customer[] CUSTOMERDATA = new Customer[SIZE];

    public static void save(Customer customer) {
        if (COUNT == SIZE) {     //数组满了，扩容为原来的二倍
            CUSTOMERDATA = Arrays.copyOf(CUSTOMERDATA, SIZE * 2);
            SIZE *= 2;  //原来的数乘以2在赋值给原来的数
        }
        for (int i = 0; i < CUSTOMERDATA.length; i++) {
            if (null == CUSTOMERDATA[i]) {
                CUSTOMERDATA[i] = customer;    //新增用户添加到数组
                COUNT++;
                return;
            }
        }
    }

    //
    public static Customer get(String customerId, String pwd) {
        for (Customer c : CUSTOMERDATA) {
            if (c.getCustomerId().equals(customerId) && c.getPwd().equals(pwd)) {
                return c;
            }
        }
        return null;
    }


    //  根据id查询用户
    public static Customer get(String customerId) {
        for (Customer c : CUSTOMERDATA) {
            if (customerId.equals(c.getCustomerId())) {
                return c;
            }
        }return  null;
    }
}

