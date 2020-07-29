package com.lujunxiong.test;

import com.lujunxiong.linear.SequenceList;

/**
 * @ClassName SequenceListTest
 * @Author 陆军雄
 * @Date 2020/7/29
 * @Description: 测试顺序表api
 **/
public class SequenceListTest {
    public static void main(String[] args) {
        SequenceList<String> s1 = new SequenceList<>(10);
        //测试插入
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("麦迪");
        s1.insert(1,"詹姆斯");

        for (String s : s1) {
            System.out.println(s);
        }

        System.out.println("---------------------------------");

        //测试获取
        String getResult = s1.get(1);
        System.out.println("getResult = " + getResult);

        //测试删除
        String removeResult = s1.remove(0);
        System.out.println("removeResult = " + removeResult);
        //测试清空
        s1.clear();
        System.out.println("清空后的元素个数为："+s1.lenght());
    }
}
