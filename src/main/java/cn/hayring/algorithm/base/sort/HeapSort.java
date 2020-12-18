package cn.hayring.algorithm.base.sort;

import cn.hayring.algorithm.base.Util;
import cn.hayring.datastruct.base.Heap;

import java.util.Comparator;


/**
 * 堆排序
 */
public class HeapSort extends Sort {
    @Override
    public <T> void sort(T[] src, Comparator<T> comparator) {
        for (int i = (src.length / 2) - 1; i > -1; i-- ) {
            Heap.adjust(src, comparator, i, src.length);
        }

        int end = src.length - 1;
        while (end > -1) {
            Util.swap(src, 0, end);
            Heap.adjust(src, comparator, 0, end);
            end--;
        }
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] src) {
        for (int i = (src.length / 2) - 1; i > -1; i-- ) {
            Heap.adjust(src, i, src.length);
        }

        int end = src.length - 1;
        while (end > -1) {
            Util.swap(src, 0, end);
            Heap.adjust(src, 0, end);
            end--;
        }
    }






}
