package com.lujunxiong.sort;

/**
 * @ClassName Merge
 * @Author 陆军雄
 * @Date 2020/7/14
 * @Description: 归并排序api
 **/
public class Merge {
    //辅助数组
    private static Comparable[] assist;

    /**
     * 对数组a中的元素进行排序
     */
    public static void sort(Comparable[] a) {
        //1.初始化辅助数组
        assist = new Comparable[a.length];
        //2.定义lo变量和hi变量，分别记录数组中最小的索引和最大的索引
        int lo = 0;
        int hi = a.length - 1;
        //3.调用sort重载方法，完成数组a中从索引lo到索引hi的元素的排序
        sort(a, lo, hi);

    }

    /**
     * 对数组a中从索引lo到索引hi之间的元素进行排序
     */
    private static void sort(Comparable[] a, int lo, int hi) {
        //做安全性校验
        if (hi <= lo) {
            return;
        }

        //对lo到hi之间的数据进行分为两个组
        int mid = lo + (hi - lo) / 2; //5 9 mid=7
        //分别对每一组数据进行排序
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        //再把两个组的数据进行归并
        merge(a, lo, mid, hi);

    }

    /**
     * 从索引lo到所以mid为一个子组，从索引mid+1到索引hi为另一个子组，
     * 把数组a中的这两个子组的数据合并成一个有序的大组（从索引lo到索引hi）
     */
    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        //定义三个指针
        int i = lo;
        int p1 = lo;
        int p2 = mid + 1;

        //遍历，移动p1指针和p2指针，比较对应索引处的值，找出小的值，放到辅助数组的对应索引
        while (p1 <= mid && p2 <= hi) {
            //比较对应索引处的值
            if (less(a[p1], a[p2])) {
                assist[i++] = a[p1++];

            } else {
                assist[i++] = a[p2++];
            }
        }
        //上面的循环结束后，如果退出循环的条件是p1<=mid，则证明左边小组中的数据已经归并完毕
        //如果退出循环的条件是p2<=hi,则证明右边小组的数据已经填充完毕；

        //所以需要把未填充完毕的数据继续填充到assist中,下面两个循环，只会执行其中的一个
        //遍历，如果p1指针没有走完，那么顺序移动p1指针，把对应元素放到辅助数组的对应索引处
        while (p1 <= mid) {
            assist[i++] = a[p1++];
        }
        //遍历，如果p2指针没有走完，那么顺序移动p1指针，把对应元素放到辅助数组的对应索引处
        while (p2 <= hi) {
            assist[i++] = a[p2++];
        }
        //到现在为止，assist数组中，从lo到hi的元素是有序的，把辅助数组中的元素拷贝到原数组
        for (int index = lo; index <= hi; index++) {
            a[index] = assist[index];
        }

    }

    /**
     * 比较v元素是否小于w元素
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 数组元素i和j交换位置
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
