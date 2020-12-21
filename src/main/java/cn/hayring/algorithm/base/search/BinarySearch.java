package cn.hayring.algorithm.base.search;

import cn.hayring.algorithm.base.Algorithm;
import cn.hayring.algorithm.base.Util;

import java.util.Comparator;

/**
 * 二分查找
 */
public class BinarySearch extends Algorithm {
    @Override
    public void run() {
        Integer[] src = Util.getSortedIntegerArray(100);
        int radomIndex = Util.random.nextInt(9);
        System.out.println("target index:" + radomIndex);
        int result = binarySearch(src, src[radomIndex]);
        System.out.println("result index:" + result);


    }


    public <T extends Comparable> int binarySearch(T[] src, T target) {
        return binarySearch(src, target, 0, src.length);
    }

    private <T extends Comparable> int binarySearch(T[] src, T target, int left, int right) {
        if (right == left) return -1;
        if (right - left == 1) return src[left].compareTo(target) == 0 ? left : -1;
        int mid = (left + right) / 2;
        if (target.compareTo(src[mid]) == 0) {
            return mid;
        }
        int leftResult = binarySearch(src, target, left, mid);
        if (leftResult == -1) {
            return binarySearch(src, target, mid, right);
        }
        return leftResult;
    }


}
