package decorator;

//缓冲层----所有种类咖啡的共同点抽取出来
public abstract class Coffee extends Drink
{
    //共同特点：计算价格
    @Override
    public Integer cost() {
        //价格从0累加
        return 0;
    }
}
