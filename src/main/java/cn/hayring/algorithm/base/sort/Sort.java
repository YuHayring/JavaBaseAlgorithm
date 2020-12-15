package cn.hayring.algorithm.base.sort;

import cn.hayring.algorithm.base.Algorithm;

import java.util.Comparator;

public abstract class Sort extends Algorithm {

    public abstract <T> void sort(T[] src, Comparator<T> comparator);

    public abstract <T extends Comparable<T>> void sort(T[] src);
}
