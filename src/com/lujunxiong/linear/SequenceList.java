package com.lujunxiong.linear;


import java.util.Iterator;

/**
 * @ClassName SequenceList
 * @Author 陆军雄
 * @Date 2020/7/29
 * @Description: 顺序表api
 **/
public class SequenceList<T> implements Iterable<T>{

    /**
     * 存储元素的数组
     */
    private T[] eles;

    /**
     * 记录当前顺序表中的元素个数
     */
    private int N;

    /**
     * 构造方法
     */
    public SequenceList(int capacity) {
        //初始化数组
        this.eles = (T[]) new Object[capacity];
        //初始化长度
        this.N = 0;
    }

    /**
     * 将一个线性表置为空表
     */
    public void clear() {
        this.N = 0;
    }

    /**
     * 判断当前线性表是否为空表
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * 获取线性表的长度
     */
    public int lenght() {
        return N;
    }

    /**
     * 获取指定位置的元素
     */
    public T get(int i) {
        return eles[i];
    }

    /**
     * 向线性表中添加元素
     */
    public void insert(T t) {
        eles[N++] = t;
    }

    /**
     * 在i元素插入元素t
     */
    public void insert(int i, T t) {
        //先把i索引处的元素及其后面的元素依次向后移动一位
        for (int index = N; index > i; index--) {
            eles[index] = eles[index - 1];

        }
        //再把t元素放到i索引处即可
        eles[i] = t;
        //元素个数+1
        N++;
    }
    /**
     * 删除指定位置i处的元素，并返回该元素
     */
    public T remove(int i){
        //记录索引i的值
        T current = eles[i];
        //索引i后面的元素依次向前移动即可
        for (int index=i;index<N-1;index++){
            eles[index]=eles[index+1];

        }
        //元素个数减一
        N--;
        return current;
    }

    /**
     * 查找指定元素第一次出现的位置
     */
    public int indexOf(T t){
        for (int i=0;i<N;i++){
            if (eles[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator{
        private int cusor;
        public SIterator(){
            this.cusor=0;
        }

        @Override
        public boolean hasNext() {
            return cusor<N;
        }

        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
}
