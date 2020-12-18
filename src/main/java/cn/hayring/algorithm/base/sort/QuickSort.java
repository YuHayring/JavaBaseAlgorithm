package cn.hayring.algorithm.base.sort;

import org.apache.log4j.Level;

import java.util.Comparator;

public class QuickSort extends Sort{


    //经典分区算法 常量
    public static final int CLASSIC_PARITIOR = 0;


    /**
     * 根据传参创建分区工具
     * @param partitor 分区工具int参数
     */
    public QuickSort(int partitor) {
        if (partitor == CLASSIC_PARITIOR) {
            this.currentPartitor = new ClassicPartitor();
        }
    }

    /**
     * 默认创建经典分区工具
     */
    public QuickSort() {
        this.currentPartitor = new ClassicPartitor();
    }

    @Override
    public <T> void sort(T[] src, Comparator<T> comparator) {
        sortCore(src, comparator, 0, src.length - 1);
    }

    private <T> void sortCore(T[] src, Comparator<T> comparator, int left, int right) {
        if (right - left < 2) return;
        int mid = currentPartitor.partition(src, comparator, left, right);
        if (mid > left + 1) {
            sortCore(src, comparator, left, mid);
        }
        if (mid < right - 2) {
            sortCore(src, comparator, mid + 1, right);
        }
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] src) {
        sortCore(src, 0, src.length - 1);
    }

    private <T extends Comparable<T>> void sortCore(T[] src, int left, int right) {
        if (right - left < 2) return;
        int mid = currentPartitor.partition(src, left, right);
        if (mid > left + 1) {
            sortCore(src, left, mid);
        }
        if (mid < right - 2) {
            sortCore(src, mid + 1, right);
        }
    }





    static interface Partitor {
        <T> int partition(T[] src, Comparator<T> comparator, int left, int right);
        <T extends Comparable<T>> int partition(T[] src, int left, int right);
    }


    private Partitor currentPartitor;


    /**
     * 经典分区工具
     */
    static class ClassicPartitor implements Partitor {

        @Override
        public <T> int partition(T[] src, Comparator<T> comparator, int left, int right) {
            T cur = src[left];
            while (left < right) {
                while (left < right && comparator.compare(src[right], cur) >= 0) right--;
                src[left] = src[right];
                while (left < right && comparator.compare(src[left], cur) <= 0) left++;
                src[right] = src[left];
            }
            src[left] = cur;
            return left;
        }

        @Override
        public <T extends Comparable<T>> int partition(T[] src, int left, int right) {
            T cur = src[left];
            while (left < right) {
                while (left < right && src[right].compareTo(cur) >= 0) right--;
                src[left] = src[right];
                while (left < right && src[left].compareTo(cur) <= 0) left++;
                src[right] = src[left];
            }
            src[left] = cur;
            return left;
        }
    }


}
