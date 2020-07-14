package com.lujunxiong.test;

/**
 * @ClassName TestFactorial
 * @Author 陆军雄
 * @Date 2020/7/14
 * @Description: 测试递归，在递归中，不能无限制的调用自己，必须要有边界条件，能够让递归结束，因为每一次递归调用都会在栈内存开辟
 * 新的空间，重新执行方法，如果递归的层级太深，很容易造成栈内存溢出。
 **/
public class TestFactorial {
    public static void main(String[] args) {
        //求n的阶乘
        long result = factorial(5);
        System.out.println(result);
    }
    //求n的阶乘，当n过大会出现栈内存溢出异常
    public static long factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);

    }
}
