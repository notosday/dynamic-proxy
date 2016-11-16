package com.lljz.reflect.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * ${DESCRIPTION}
 *
 * @author 军舰鸟
 * @version V1.0
 * @Title: ${CLASS_NAME}
 * Copyright: Copyright (c) 2016
 * Company:杭州淋漓尽致科技有限公司
 * @date 2016年11月16日 11:11
 */
public class CglibExample {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ConcreteClass.class);
        enhancer.setCallback(new ConcreteInterceptor());
        ConcreteClass cc = (ConcreteClass) enhancer.create();
        System.out.println(cc.getMethodA("aaddd"));
        System.out.println(cc.getMethodB(12));
    }
}
