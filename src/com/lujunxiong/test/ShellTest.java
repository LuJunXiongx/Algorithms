package com.lujunxiong.test;

import com.lujunxiong.sort.Shell;

import java.util.Arrays;

/**
 * @ClassName ShellTest
 * @Author 陆军雄
 * @Date 2020/7/13
 * @Description: 希尔排序测试
 **/
public class ShellTest {
    public static void main(String[] args) {
        Integer[] a = {9,1,2,5,7,4,8,6,3,5};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
