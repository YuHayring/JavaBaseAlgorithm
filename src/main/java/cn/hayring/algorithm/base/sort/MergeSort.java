package cn.hayring.algorithm.base.sort;

import cn.hayring.algorithm.base.sort.Sort;
import org.apache.log4j.Level;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MergeSort extends Sort {
    @Override
    public void run() {
        Integer[] src = new Integer[]{3,4,6,3,8,9,3,1,6,8,0};
        sort(src);
        StringBuilder builder = new StringBuilder();
        for (Integer a : src) {
            builder.append(a + " ");
        }
        logger.log(Level.INFO, builder.toString());
    }


    @Override
    public <T> void sort(T[] src, Comparator<T> comparator) {
        sortCore(src, comparator, 0, src.length);
    }

    public <T> void sortCore(T[] src, Comparator<T> comparator, int left, int right) {
        if (left + 2 > right) return;


        int mid = (left + right) / 2;
        sortCore(src, comparator, left, mid);
        sortCore(src, comparator, mid, right);

        T[] rightTmp = (T[]) Array.newInstance(src[0].getClass(),right - mid);
        System.arraycopy(src, mid, rightTmp, 0, rightTmp.length);
        int i = right - 1;
        int j = mid - 1;
        int k = rightTmp.length - 1;
        while (j > -1 && k > -1) {
            if (comparator.compare(src[j], rightTmp[k]) > 0) {
                src[i--] = rightTmp[k--];
            } else {
                src[i--] = src[j--];
            }
        }
        while (j > -1) src[i--] = src[j--];
        while (k > -1) src[i--] = rightTmp[k--];
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] src) {
        sortCore(src, 0, src.length);
    }

    public <T extends Comparable<T>> void sortCore(T[] src, int left, int right) {
        if (left + 2 > right) return;


        int mid = (left + right) / 2;
        sortCore(src, left, mid);
        sortCore(src, mid, right);

        T[] rightTmp = (T[]) Array.newInstance(src[0].getClass(),right - mid);
        System.arraycopy(src, mid, rightTmp, 0, rightTmp.length);
        int i = right - 1;
        int j = mid - 1;
        int k = rightTmp.length - 1;
        while (j > -1 && k > -1) {
            if (src[j].compareTo(rightTmp[k]) > 0) {
                src[i--] = src[j--];
            } else {
                src[i--] = rightTmp[k--];
            }
        }
        while (j > -1) src[i--] = src[j--];
        while (k > -1) src[i--] = rightTmp[k--];
    }
}
