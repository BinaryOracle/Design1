package com.food;

import com.food.food;
import com.foodAnnotion.Food;

@Food("chicken")
public class chicken extends food
{
    @Override
    public String getFood() {
        return "肯德基";
    }
}
