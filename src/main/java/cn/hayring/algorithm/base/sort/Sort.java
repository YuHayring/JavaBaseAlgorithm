package cn.hayring.algorithm.base.sort;

import cn.hayring.algorithm.base.Algorithm;
import cn.hayring.algorithm.base.Util;
import org.apache.log4j.Level;

import java.util.Comparator;
import java.util.Random;

public abstract class Sort extends Algorithm {

    /**
     * Test func
     */
    public void run() {
        Integer[] src = Util.getRadomIntegerArray(100);
        sort(src);
        Util.showArray(src, logger);
    }

    public abstract <T> void sort(T[] src, Comparator<T> comparator);

    public abstract <T extends Comparable<T>> void sort(T[] src);
}
