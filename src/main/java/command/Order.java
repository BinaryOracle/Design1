package command;

import java.util.HashMap;
import java.util.Map;

//将客人点餐的请求封装为一个请求类
//即订单类
public class Order
{
    //几号桌点餐
    private  Integer diningTable;
    //当前桌客人点的菜品
    private Map<String,Integer> FoodDic=new HashMap<>();

    public Integer getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(Integer diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return FoodDic;
    }

    public void setFoodDic(String foodName,Integer num)
    {
        FoodDic.put(foodName,num);
    }
}
