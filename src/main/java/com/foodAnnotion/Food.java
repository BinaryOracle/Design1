package com.foodAnnotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//当前被描述的注解，会被保留到字节码文件中，并被JVM读取到
@Retention(RetentionPolicy.RUNTIME)
//value可以省略,只能作用在类上
@Target(ElementType.TYPE)
public @interface Food
{
    //指定Bean在Map中的一个名字
    //抽象方法
    String value();
}
