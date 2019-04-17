package com.example.demo;

/**
 * @pathName：HumanFactory
 * @author：ZhangWei
 */
public interface HumanFactory {

    /**
     * 生产黄色人种
     * @return
     */
    Human createYellowHuman();

    /**
     * 生产白色人种
     * @return
     */
    Human createWhileHuman();

    /**
     * 生产黑色人种
     * @return
     */
    Human createBlackHuman();

}
