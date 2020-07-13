package com.lujunxiong.test;

import com.lujunxiong.sort.Bubble;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName BubbleTest
 * @Author 陆军雄
 * @Date 2020/7/12
 * @Description: 测试冒泡排序api
 **/
public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4,5,6,3,2,1};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
