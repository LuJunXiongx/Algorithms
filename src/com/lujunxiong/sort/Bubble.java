package com.lujunxiong.sort;

/**
 * @ClassName Bubble
 * @Author 陆军雄
 * @Date 2020/7/12
 * @Description: 冒泡排序api
 **/
public class Bubble {
    /**
     * 对数组a中的元素进行排序
     */
    public static void sort(Comparable[] a){
        for(int i=a.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                //比较索引j和索引j+1的值
                if(greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
        }

    }

    /**
     * 比较v元素是否大于w元素
     */
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    /**
     * 数组元素i和j交换位置
     */
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
