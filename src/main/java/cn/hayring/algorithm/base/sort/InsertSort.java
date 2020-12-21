package cn.hayring.algorithm.base.sort;

import cn.hayring.algorithm.base.Util;

import java.util.Comparator;

public class InsertSort extends Sort {
    @Override
    public <T> void sort(T[] src, Comparator<T> comparator) {
        for (int i = 1; i < src.length; i++) {
            int cur = i;
            while (cur > 0 && comparator.compare(src[cur-1], src[cur]) > 0) {
                Util.swap(src, cur, cur-1);
                cur--;
            }
        }
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] src) {
        for (int i = 1; i < src.length; i++) {
            int cur = i;
            while (cur > 0 && src[cur-1].compareTo(src[cur]) > 0) {
                Util.swap(src, cur, cur-1);
                cur--;
            }
        }
    }
}
