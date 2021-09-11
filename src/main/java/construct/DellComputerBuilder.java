package construct;

//链式调用
public class DellComputerBuilder extends Builder
{
    @Override
    public Builder buildMouse()
    {
        System.out.println("戴尔鼠标组装");
        return this;
    }

    @Override
    public Builder buildKeyBoard()
    {
        System.out.println("戴尔键盘组装");
        return this;
    }

    @Override
    public Builder buildScreen()
    {
        System.out.println("戴尔屏幕组装");
        return this;
    }
}
