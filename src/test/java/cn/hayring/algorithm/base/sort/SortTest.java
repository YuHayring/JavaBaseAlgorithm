package cn.hayring.algorithm.base.sort;


import org.apache.log4j.Level;
import org.junit.Test;

import java.util.Random;

public class SortTest {

    @Test
    public void once() {
        Integer[] src = new Integer[10];
        Random random = new Random((int)System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            src[i] = random.nextInt(100);
        }
        Sort sorter = new HeapSort();
        sorter.sort(src);
        for (int i = 1; i < src.length; i++) {
            assert src[i] >= src[i-1];
        }
    }


}
