package command;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.function.ObjDoubleConsumer;

public class Test
{
    public static void main(String[] args) {
        //创建订单对象---请求被包装成一个类
        Order order=new Order();
        order.setDiningTable(1);
        order.setFoodDic("大鸡腿",2);

        //创建厨师对象---接收者
        SeniorChef chef=new SeniorChef();

        //创建命令类--组合接受者和具体请求
        Command command=new OrderCommand(chef,order);

        //创建服务员---调用者
        Waitor waitor=new Waitor();
        //将命令组合进去
        waitor.setCmd(command);
        //执行命令
        waitor.OrderUp();
    }
}
