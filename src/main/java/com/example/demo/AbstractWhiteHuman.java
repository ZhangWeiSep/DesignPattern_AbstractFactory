package com.example.demo;

/**
 * @pathName：AbstractWhiteHuman
 * @author：ZhangWei
 */
public abstract class AbstractWhiteHuman implements Human {

    /**
     * 人种颜色
     */
    @Override
    public void getColor() {
        System.out.println("白色人种");
    }

    /**
     * 人类行为：说话
     */
    @Override
    public void talk() {
        System.out.println("一般都说单字节");
    }

}
