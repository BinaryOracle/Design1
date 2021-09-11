package com;

import com.factory.chickenFactory;
import com.factory.factory;
import com.factory.fishFactory;
import org.junit.Test;

public class test
{
    @Test
    public  void test()
    {
        //获得鱼排
        factory f=new fishFactory();
        String food = f.getFood().getFood();
        System.out.println(food);
        //获得鸡排
        f=new chickenFactory();
        String food2 = f.getFood().getFood();
        System.out.println(food2);
    }
}
