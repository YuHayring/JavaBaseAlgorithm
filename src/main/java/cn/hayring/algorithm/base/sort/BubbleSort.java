package cn.hayring.algorithm.base.sort;

import org.apache.log4j.Level;

import java.util.Comparator;

public class BubbleSort extends Sort {



    public <T> void sort(T[] src, Comparator<T> comparator)  {
        T tmp;
        for (int i = 0; i < src.length; i++) {
            for (int j = i + 1; j < src.length; j++) {
                if (comparator.compare(src[j-1], src[j]) > 0) {
                    tmp = src[i];
                    src[i] = src[j];
                    src[j] = tmp;
                }
            }
        }
    }

    public <T extends Comparable<T>> void sort(T[] src) {
        T tmp;
        for (int i = 0; i < src.length; i++) {
            for (int j = i + 1; j < src.length; j++) {
                if (src[j-1].compareTo(src[j]) > 0) {
                    tmp = src[i];
                    src[i] = src[j];
                    src[j] = tmp;
                }
            }
        }
    }






}
