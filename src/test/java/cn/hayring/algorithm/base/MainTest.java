package cn.hayring.algorithm.base;

import cn.hayring.algorithm.base.sort.QuickSort;
import cn.hayring.algorithm.base.sort.MergeSort;
import org.junit.Test;

public class MainTest {

    @Test
    public void main() {
        System.out.println("Start");
        Runnable toTest = new QuickSort();
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


}
