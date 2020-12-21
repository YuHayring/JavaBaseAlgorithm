package cn.hayring.algorithm.base.sort;

import cn.hayring.algorithm.base.Util;

import java.util.Comparator;

public class SelectSort extends Sort {
    @Override
    public <T> void sort(T[] src, Comparator<T> comparator) {
        for (int i = 0; i < src.length; i++) {
            int min = i;
            for (int j = i; j < src.length; j++) {
                if (comparator.compare(src[min], src[j]) > 0) {
                    min = j;
                }
            }
            Util.swap(src, i, min);
        }
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] src) {
        for (int i = 0; i < src.length; i++) {
            int min = i;
            for (int j = i; j < src.length; j++) {
                if (src[min].compareTo(src[j]) > 0) {
                    min = j;
                }
            }
            Util.swap(src, i, min);
        }
    }
}
