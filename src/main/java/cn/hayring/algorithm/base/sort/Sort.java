package cn.hayring.algorithm.base.sort;

import cn.hayring.algorithm.base.Algorithm;
import org.apache.log4j.Level;

import java.util.Comparator;
import java.util.Random;

public abstract class Sort extends Algorithm {

    /**
     * Test func
     */
    public void run() {
        Integer[] src = new Integer[10];
        Random random = new Random((int)System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            src[i] = random.nextInt(100);
        }
        sort(src);
        StringBuilder builder = new StringBuilder();
        for (Integer a : src) {
            builder.append(a + " ");
        }
        logger.log(Level.INFO, builder.toString());
    }

    public abstract <T> void sort(T[] src, Comparator<T> comparator);

    public abstract <T extends Comparable<T>> void sort(T[] src);
}
