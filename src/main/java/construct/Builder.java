package construct;

public abstract class Builder
{
    //要建造的产品--子类也可以使用，因此是protected
    protected Computer computer=new Computer();
    //建造的步骤--顺序不固定
    //方法都是抽象的，具体实现交给子类完成
    public abstract Builder buildMouse();
    public abstract Builder buildKeyBoard();
    public abstract Builder buildScreen();
    //创建产品的方法，由当前抽象层实现
    public Computer createComputer()
    {
        return computer;
    }
}
