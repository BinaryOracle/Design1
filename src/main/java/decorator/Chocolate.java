package decorator;

public class Chocolate extends Decorator{
     //用一个实例变量记录饮料，也就是被装饰者
    Drink drink;
    Chocolate(Drink drink) {
       this.drink=drink;
    }

    @Override
    public String getDecription() {
        return "加了巧克力的"+drink.getDecription();
    }

    @Override
    public Integer cost() {
        //在原有饮料价格的基础上加上调料味的价格
        return 5+drink.cost();
    }
}
