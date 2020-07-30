package com.lujunxiong.test;

import com.lujunxiong.linear.LinkList;

/**
 * @ClassName LinkListTest
 * @Author 陆军雄
 * @Date 2020/7/30
 * @Description: 单向链表测试
 **/
public class LinkListTest {
    public static void main(String[] args) {
        LinkList<String> s1 = new LinkList<>();

        /**
         * 测试插入
         */
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("麦迪");
        s1.insert("66");
        s1.insert("77");
        s1.insert(1,"詹姆斯");
        s1.insert(3,"张三");


        for (String s : s1) {
            System.out.println(s);
        }

        System.out.println("---------------------------------");

        //测试获取
        String getResult1 = s1.get(1);
        System.out.println("getResult1 = " + getResult1);
        String getResult2 = s1.get(2);
        System.out.println("getResult2 = " + getResult2);

        //测试删除
        String removeResult = s1.remove(0);
        System.out.println("removeResult = " + removeResult);
        //测试清空
        s1.clear();
        System.out.println("清空后的元素个数为："+s1.length());
    }
}
