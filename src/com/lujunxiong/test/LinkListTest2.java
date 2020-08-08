package com.lujunxiong.test;

import com.lujunxiong.linear.LinkList;

/**
 * @ClassName LinkListTest
 * @Author 陆军雄
 * @Date 2020/7/30
 * @Description: 单向链表测试
 **/
public class LinkListTest2 {
    public static void main(String[] args) {
        /**
         * 测试单向链表对象
         */
        LinkList<String> s1 = new LinkList<>();

        /**
         * 测试插入
         */
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("麦迪");
        s1.insert("66");
        s1.insert("77");
        s1.insert(1, "詹姆斯");
        s1.insert(3, "张三");


        for (String s : s1) {
            System.out.println(s);
        }

        System.out.println("---------------------------------");
        System.out.println("链表反转：");
        s1.reverse();
        for (String s: s1) {
            System.out.println(s);

        }

    }


}
