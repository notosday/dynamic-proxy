package com.lljz.reflect.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ${DESCRIPTION}
 *
 * @author 军舰鸟
 * @version V1.0
 * @Title: ${CLASS_NAME}
 * Copyright: Copyright (c) 2016
 * Company:杭州淋漓尽致科技有限公司
 * @date 2016年11月16日 11:02
 */
public class ConcreteInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("object "+o.getClass().getName());
        System.out.println("before.."+method);
        Object invokeSuper = methodProxy.invokeSuper(o, objects);

        System.out.println("after.."+method);
        return invokeSuper;
    }
}
