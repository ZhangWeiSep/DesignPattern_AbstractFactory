package com.example.demo;

/**
 * @pathName：AbstractYellowHuman
 * @author：ZhangWei
 */
public abstract class AbstractYellowHuman implements Human {

    /**
     * 人种颜色
     */
    @Override
    public void getColor() {
        System.out.println("黄色人种");
    }

    /**
     * 人类行为：说话
     */
    @Override
    public void talk() {
        System.out.println("一般都说双字节");
    }

}
