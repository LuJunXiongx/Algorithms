package com.lujunxiong.test;

import com.lujunxiong.sort.Selection;

import java.util.Arrays;

/**
 * @ClassName SelectionTest
 * @Author 陆军雄
 * @Date 2020/7/12
 * @Description: 测试简单排序api
 **/
public class SelectionTest {
    public static void main(String[] args) {
        //原始数据
        Integer[] a = {4,6,8,7,9,2,10,1};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
