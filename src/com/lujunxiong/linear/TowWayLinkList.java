package com.lujunxiong.linear;

import java.util.Iterator;

/**
 * @ClassName TowWayLinkList
 * @Author 陆军雄
 * @Date 2020/8/8
 * @Description: 双向链表Api
 **/
public class TowWayLinkList<T> implements Iterable<T> {
    /**
     * 首节点
     */
    private Node head;

    /**
     * 最后一个节点
     */
    private Node last;

    /**
     * 链表的长度
     */
    private int N;

    public TowWayLinkList() {
        last = null;
        head = new Node(null, null, null);
        N = 0;
    }




    /**
     * 清空链表
     */
    public void clear() {
        last = null;
        //head.next = last;
        head.pre = null;
        head.item = null;
        N = 0;
    }



    /**
     * 获取链表长度
     * @return 链表长度
     */
    public int length() {
        return N;
    }



    /**
     * 判断链表是否为空
     * @return
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * 获取第一个元素
     */
    public T getFirst(){
        if (isEmpty()){
            return null;
        }
        return head.next.item;
    }


    /**
     *
     * @return  最后一个元素
     */
    public T getLast(){
        if (isEmpty()){
            return null;
        }
        return last.item;
    }





    /**
     * 插入元素t
     * @param t
     */
    public void insert(T t) {
        if (isEmpty()) {
            //如果链表为空
            //创建新的节点
            Node newNode = new Node(t, head, null);
            //让新结点成为尾结点
            last = newNode;
            //让头结点指向尾结点
            head.next = last;
        } else {
            //如果链表不为空
            Node oldLast = last;
            //创建新结点
            Node newNode = new Node(t, oldLast, null);
            //让当前的尾结点指向新结点
            oldLast.next = newNode;
            //让新结点成为尾结点
            last = newNode;
        }
        //元素个数加1
        N++;
    }

    /**
     * 在指定位置i处插入元素
     * @param i
     * @param t
     */
    public void insert(int i, T t) {
        //找到i位置的前一个结点
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        //找到i位置的结点
        Node curr = pre.next;
        //创建新结点
        Node newNode = new Node(t, pre, curr);
        //让i位置的前一个结点的下一个结点成为新结点
        pre.next = newNode;
        //让i位置的前一个结点变为新结点
        curr.pre = newNode;
        //元素个数加1
        N++;
    }


    /**
     * 获取指定位置i处的元素
     * @param i
     * @return
     */
    public T get(int i) {
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }


    /**
     * 找到元素t在链表中第一次出现的位置
     * @param t
     * @return
     */
    public int indexOf(T t) {
        Node node = head;
        for (int i = 0; node.next != null; i++) {
            node = node.next;
            if (node.next.equals(t)) {
                return i;
            }
        }
        //没找到
        return -1;
    }


    /**
     * 删除i位置处的元素
     * @param i
     * @return
     */
    public T remove(int i) {
        //找到i位置的前一个结点
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        //找到i位置的结点
        Node curr = pre.next;
        //找到i位置的下一个结点
        Node nextNode = curr.next;
        //让i位置的前一个结点的下一个结点变为i位置的下一个结点
        pre.next=nextNode;
        //让i位置的下一个结点的上一个结点变为i位置的前一个结点
        nextNode.pre=pre;
        //让元素个数减1
        N--;
        return curr.item;
    }



    /**
     * 节点类
     */
    private class Node {
        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }

        //存储数据
        public T item;
        //指向上一个结点
        public Node pre;
        //指向下一个结点
        public Node next;
    }

    @Override
    public Iterator<T> iterator() {
        return new TtIterator();
    }


    private class TtIterator implements Iterator{

        private Node n;
        public TtIterator(){
            this.n=head;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }
}
