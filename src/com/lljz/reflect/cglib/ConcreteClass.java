package com.lljz.reflect.cglib;

/**
 * ${DESCRIPTION}
 *
 * @author 军舰鸟
 * @version V1.0
 * @Title: ${CLASS_NAME}
 * Copyright: Copyright (c) 2016
 * Company:杭州淋漓尽致科技有限公司
 * @date 2016年11月16日 10:57
 */
public class ConcreteClass {
    public String getMethodA(String str){
        System.out.println("concreteMethodA ..."+str);
        return str;
    }

    public int getMethodB(int n){
        System.out.println("concrreteMethodB ..."+n);
        return n+10;
    }
}
