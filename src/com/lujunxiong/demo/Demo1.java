package com.lujunxiong.demo;

/**
 * @ClassName Demo1
 * @Author 陆军雄
 * @Date 2020/7/12
 * @Description: TODO
 **/
public class Demo1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int sum = 0;
        int n=100;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
