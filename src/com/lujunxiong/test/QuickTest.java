package com.lujunxiong.test;

import com.lujunxiong.sort.Quick;

import java.util.Arrays;

/**
 * @ClassName QuickTest
 * @Author 陆军雄
 * @Date 2020/7/29
 * @Description: TODO
 **/
public class QuickTest {
    public static void main(String[] args) {
        Integer[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 8};
        Quick.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
