package com.example.demo;

/**
 * @pathName：MaleFactory
 * @author：ZhangWei
 */
public class MaleFactory implements HumanFactory {
    /**
     * 生产黄色人种——男性
     *
     * @return
     */
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    /**
     * 生产白色人种
     *
     * @return
     */
    @Override
    public Human createWhileHuman() {
        return null;
    }

    /**
     * 生产黑色人种
     *
     * @return
     */
    @Override
    public Human createBlackHuman() {
        return null;
    }
}
