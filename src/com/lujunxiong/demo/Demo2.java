package com.lujunxiong.demo;

/**
 * @ClassName Demo2
 * @Author 陆军雄
 * @Date 2020/7/12
 * @Description: 计算100个1+100个2+100个3+...100个100的结果
 **/
public class Demo2 {
    public static void main(String[] args) {
        int sum=0;
        int n=100;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                sum+=i;
            }
        }
        System.out.println("sum="+sum);
    }
}
