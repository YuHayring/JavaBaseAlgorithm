package cn.hayring.datastruct.base;

import cn.hayring.algorithm.base.Util;

import java.util.Comparator;

public class Heap {
    /**
     * 堆调整算法
     * @param src 数据源
     * @param start 开始下标
     * @param end 结束下标（不包括）
     * @param <T>
     */
    public static <T extends Comparable<T>> void adjust(T[] src, int start, int end) {
        int left, right, target;
        left = start * 2 + 1;
        while (left < end) {
            right = left + 1;
            target = left;
            if (right < end && src[left].compareTo(src[right]) < 0) {
                target = right;
            }
            if (src[target].compareTo(src[start]) > 0) {
                Util.swap(src, start, target);
            } else {
                break;
            }
            start = target;
            left = start * 2 + 1;
        }
    }

    /**
     * 堆调整算法
     * @param src 数据源
     * @param comparator 比较器
     * @param start 目标堆堆顶（开始下标）
     * @param end 结束下标
     * @param <T>
     */
    public static <T> void adjust(T[] src, Comparator<T> comparator, int start, int end) {
        int left, right, target;
        left = start * 2 + 1;
        while (left < end) {
            right = left + 1;
            target = left;
            if (right < end && comparator.compare(src[left], src[right]) < 0) {
                target = right;
            }
            if (comparator.compare(src[target], src[start]) > 0) {
                Util.swap(src, start, target);
            } else {
                break;
            }
            start = target;
            left = start * 2 + 1;
        }
    }
}
