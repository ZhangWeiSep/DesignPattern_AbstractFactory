package com.example.demo;

/**
 * @pathName：AbstractBlockHuman
 * @author：ZhangWei
 */
public abstract class AbstractBlockHuman implements Human {

    /**
     * 人种颜色
     */
    @Override
    public void getColor() {
        System.out.println("黑色人种");
    }

    /**
     * 人类行为：说话
     */
    @Override
    public void talk() {
        System.out.println("一般说话听不懂");
    }

}
