package cn.hayring.algorithm.base;

public class Util {
    public static <T> void swap(T[] src, int i, int j) {
        T tmp = src[i];
        src[i] = src[j];
        src[j] = tmp;
    }
}
