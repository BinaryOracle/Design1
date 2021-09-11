package com.factory;

import com.BeanUtils.BeanUtils;
import com.food.chicken;
import com.food.fish;
import com.food.food;
import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;

public class chickenFactory extends factory
{
    BeanUtils beanUtils=new BeanUtils();
    @Override
    public food getFood()
    {
        chicken f = (chicken) beanUtils.getBean("chicken");
          return f;
    }
}
