package com.example.demo;

/**
 * @pathName：FamaleFactory
 * @author：ZhangWei
 */
public class FamaleFactory implements HumanFactory {


    /**
     * 生产黄色人种——女性
     *
     * @return
     */
    @Override
    public Human createYellowHuman() {
        return new FamaleYellowHuman();
    }

    /**
     * 生产白色人种——女性
     *
     * @return
     */
    @Override
    public Human createWhileHuman() {
        return null;
    }

    /**
     * 生产黑色人种——女性
     *
     * @return
     */
    @Override
    public Human createBlackHuman() {
        return null;
    }
}
