package cn.hayring.algorithm.base.sort;

import org.apache.log4j.Level;

import java.util.Comparator;

public class QuickSort extends Sort{




    @Override
    public <T> void sort(T[] src, Comparator<T> comparator) {
        //TODO
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


    private Partitor currentPartitor = new ClassicPartitor();

    class ClassicPartitor implements Partitor {

        @Override
        public <T> int partition(T[] src, Comparator<T> comparator, int left, int right) {
            //TODO
            return 0;
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
