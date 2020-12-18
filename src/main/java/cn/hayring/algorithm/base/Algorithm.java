package cn.hayring.algorithm.base;

import org.apache.log4j.Logger;

/**
 * 继承 runnable 的算法类
 * 可以使用 run 方法运行测试方法
 *
 */
public abstract class Algorithm implements Runnable{
    protected Logger logger = Logger.getLogger(this.getClass());


}
