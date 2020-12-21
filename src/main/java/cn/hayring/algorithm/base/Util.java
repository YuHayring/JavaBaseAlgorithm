package cn.hayring.algorithm.base;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.Random;

public class Util {



    public static <T> void swap(T[] src, int i, int j) {
        T tmp = src[i];
        src[i] = src[j];
        src[j] = tmp;
    }


    public static Random random = new Random((int)System.currentTimeMillis());

    public static Integer[] getRadomIntegerArray(int maxValue) {
        Integer[] src = new Integer[10];
        for (int i = 0; i < 10; i++) {
            src[i] = random.nextInt(maxValue);
        }
        return src;
    }

    public static Integer[] getSortedIntegerArray(int bound) {
        Integer[] src = new Integer[10];
        int prev = 0;
        for (int i = 0; i < 10; i++) {
            prev = src[i] = prev + random.nextInt(bound);
        }
        return src;
    }

    public static <T> void showArray(T[] src, Logger logger) {
        StringBuilder builder = new StringBuilder();
        for (T o : src) {
            builder.append(o.toString() + " ");
        }
        logger.log(Level.INFO, builder.toString());
    }


}
