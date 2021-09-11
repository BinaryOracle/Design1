package com.food;

import com.food.food;
import com.foodAnnotion.Food;

@Food("fish")
public class fish extends food
{
    @Override
    public String getFood()
    {
        return "大鱼排";
    }
}
