package com.lljz.reflect.res;

/**
 * ${DESCRIPTION}
 *
 * @author 军舰鸟
 * @version V1.0
 * @Title: ${CLASS_NAME}
 * Copyright: Copyright (c) 2016
 * Company:杭州淋漓尽致科技有限公司
 * @date 2016年11月15日 15:52
 */
public class ConcreteClass implements TargetInterface {
    @Override
    public int targetMethodA(int number,int n) {
        System.out.println("methodA...");
        System.out.println("operate number:"+number+" "+n);
        System.out.println("methodA end");
        return number*n;
    }

    @Override
    public int targetMethodB(int number,int n) {
        System.out.println("methodB...");
        System.out.println("operate number:"+number+" "+n);
        System.out.println("methodB end");
        return number*n;
    }
}
