package com.factory;

import com.BeanUtils.BeanUtils;
import com.food.fish;
import com.food.food;

public class fishFactory  extends factory
{
    BeanUtils beanUtils=new BeanUtils();
    @Override
    public food getFood()
    {
        fish f = (fish) beanUtils.getBean("fish");
        return f;
    }
}
