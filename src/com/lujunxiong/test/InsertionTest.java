package com.lujunxiong.test;

import com.lujunxiong.sort.Insertion;

import java.util.Arrays;

/**
 * @ClassName InsertionTest
 * @Author 陆军雄
 * @Date 2020/7/13
 * @Description: 测试插入排序
 **/
public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a = {4,3,2,10,12,1,5,6};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
