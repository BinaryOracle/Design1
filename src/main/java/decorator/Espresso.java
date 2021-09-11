package decorator;

public class Espresso extends Coffee
{
    //设置描述信息
    Espresso()
    {
        decription="意大利咖啡";
    }
    @Override
    public Integer cost() {
        //意大利咖啡20元
        return 20;
    }
}
