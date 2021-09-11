package command;

//具体订单命令
public class OrderCommand extends Command {
    //持有接受者对象和订单对象
    private SeniorChef chef;
    private Order order;
    //通过构造函数为属性赋值
    OrderCommand(SeniorChef seniorChef,Order order)
    {
        this.chef=seniorChef;
        this.order=order;
    }
    //通过调用接受者对象的方法，来执行命令的具体逻辑行为
    @Override
    public void execute()
    {
        System.out.println(order.getDiningTable()+"号桌的订单");
        //遍历集合: key-->foodName value--->食物点了几份
        order.getFoodDic().forEach((key,value)->{
            chef.makeFood(key,value);
        });
    }
}
