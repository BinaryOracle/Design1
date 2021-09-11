package decorator;

import org.junit.Test;

public class test
{
    @Test
    public void test()
    {
        //模拟下单
        //首先点一个美式咖啡，不加任何调料
        Drink drink=new LongBlack();
        System.out.println("购买了"+drink.getDecription()+"  花了"+drink.cost());
        //给美式咖啡加一个巧克力
        drink=new Chocolate(drink);
        System.out.println("购买了"+drink.getDecription()+"  花了"+drink.cost());
        //给美式咖啡再加一个牛奶
        drink=new Milk(drink);
        System.out.println("购买了"+drink.getDecription()+"  花了"+drink.cost());
        //再把牛奶和巧克力加一次
        drink=new Chocolate(drink);
        System.out.println("购买了"+drink.getDecription()+"  花了"+drink.cost());
        drink=new Milk(drink);
        System.out.println("购买了"+drink.getDecription()+"  花了"+drink.cost());
        System.out.println("====================================================");
        //简化写法
        Drink d=new Chocolate(new Milk(new ChinaBlack()));
        System.out.println("购买了"+d.getDecription()+"  花了"+d.cost());
    }
}
