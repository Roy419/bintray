package com.roy.testdemo.enjoy.structure.facade;


import com.roy.testdemo.enjoy.create.fatory.abstractFactory.AbstractFactory;
import com.roy.testdemo.enjoy.create.fatory.abstractFactory.AppleFactory;
import com.roy.testdemo.enjoy.entity.Bag;
import com.roy.testdemo.enjoy.structure.decorator.CheckedBagDecorator;
import com.roy.testdemo.enjoy.structure.decorator.ReinforceBagDecorator;
import com.roy.testdemo.enjoy.structure.decorator.SpeedDecorator;

/**
 * 包装服务
 */
public class PackService {

    /**
     * 水果打包：防伪/加固/加急等
     */
    public void doPack(){
        AbstractFactory factory = new AppleFactory();

        //得到包装
        Bag bag = factory.getBag();

        //现需要增加防伪标识
        bag = new CheckedBagDecorator(bag);//防伪功能
        bag = new ReinforceBagDecorator(bag);//加固功能
        bag = new SpeedDecorator(bag);//加急功能

        bag.pack();
    }

    public void doOther(){
        System.out.println("其它服务");
    }
}
