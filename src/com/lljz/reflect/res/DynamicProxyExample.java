package com.lljz.reflect.res;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * ${DESCRIPTION}
 *
 * @author 军舰鸟
 * @version V1.0
 * @Title: ${CLASS_NAME}
 * Copyright: Copyright (c) 2016
 * Company:杭州淋漓尽致科技有限公司
 * @date 2016年11月15日 15:48
 */
public class DynamicProxyExample {
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        InvocationHandler ih = new ProxyHandler(concreteClass);

        System.out.println("interface "+concreteClass.getClass().getInterfaces()[0]);

        TargetInterface targetInterface = (TargetInterface) Proxy.newProxyInstance(concreteClass.getClass().getClassLoader(), concreteClass.getClass().getInterfaces(), ih);
        int i = targetInterface.targetMethodA(5,6);
        System.out.println(i);
        int i1 = targetInterface.targetMethodB(15,6);
        System.out.println(i1);
    }
}
