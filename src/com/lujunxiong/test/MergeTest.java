package com.lujunxiong.test;

import com.lujunxiong.sort.Merge;

import java.util.Arrays;

/**
 * @ClassName MergeTest
 * @Author 陆军雄
 * @Date 2020/7/14
 * @Description: 归并排序测试
 **/
public class MergeTest {
    public static void main(String[] args) {
        Integer[] a = {8, 4, 5, 7, 1, 3, 6, 2};
        Merge.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
