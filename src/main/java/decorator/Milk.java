package decorator;

public class Milk extends Decorator{
    Drink drink;

    Milk(Drink drink)
    {
        this.drink=drink;
    }
    @Override
    public String getDecription()
    {
        return "加了牛奶的"+this.drink.getDecription();
    }

    @Override
    public Integer cost()
    {
        return this.drink.cost()+3;
    }
}
