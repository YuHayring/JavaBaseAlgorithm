package cn.hayring.algorithm.base;

import cn.hayring.algorithm.base.search.BinarySearch;
import cn.hayring.algorithm.base.sort.HeapSort;
import cn.hayring.algorithm.base.sort.QuickSort;
import cn.hayring.algorithm.base.sort.MergeSort;
import org.apache.log4j.Logger;
import org.junit.Test;

public class MainTest {

    @Test
    public void main() {
        System.out.println("Start");
        Runnable toTest = new BinarySearch();
        try{
            toTest.run();
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("END");
        }
        System.exit(0);

    }

    @Test
    public void tempTest() {
        Integer[] tmp = Util.getSortedIntegerArray(20);
        Util.showArray(tmp, Logger.getLogger(this.getClass()));
    }




}
