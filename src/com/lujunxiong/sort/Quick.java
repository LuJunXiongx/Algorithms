package com.lujunxiong.sort;

/**
 * @ClassName Quick
 * @Author 陆军雄
 * @Date 2020/7/29
 * @Description: 快速排序api
 **/
public class Quick {
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

    /**
     * 对数组内得元素进行排序
     */
    public static void sort(Comparable[] a) {
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);
    }

    /**
     * 对数组a中从索引lo到索引之间得元素进行排序
     *
     * @param a
     * @param lo
     * @param hi
     */
    private static void sort(Comparable[] a, int lo, int hi) {
        //安全性校验
        if (hi <= lo) {
            return;
        }

        //需要对数组中lo索引到hi索引处的元素进行分组（左子组和右自组）
        //返回的分组的分界值索引，分界值位置变换后的索引
        int partition = partition(a, lo, hi);

        //让左子组有序
        sort(a, lo, partition - 1);
        //让右自组有序
        sort(a, partition + 1, hi);


    }

    /**
     * 对数组a中,从索引lo到索引hi之间的元素进行分组,并返回分组界限对应的索引
     *
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    public static int partition(Comparable[] a, int lo, int hi) {
        //确定分界值
        //把最左边的元素当做基准值
        Comparable key = a[lo];
        //定义两个指针，分别指向待切分元素的最小索引处和最大索引处的下一个位置
        int left = lo;
        int right = hi + 1;

        //切分
        while (true) {
            //先从右往左扫描，移动right指针，找到比分界值小的元素，停止
            while (less(key, a[--right])) {
                if (right == lo) {
                    break;
                }

            }
            //先从左往右扫描，移动left指针，找到比分界值大的元素，停止
            while (less(a[++left], key)) {
                if (left == hi) {
                    break;
                }
            }

            //判断left是否大于等于right，则证明元素扫描完毕，如果不是，则交换元素即可
            if (left >= right) {
                break;
            } else {
                exch(a, left, right);
            }
        }
        //交换分界值
        exch(a, lo, right);

        return right;
    }

}
