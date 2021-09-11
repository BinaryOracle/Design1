package construct;

public class ASUSComputerBuilder extends Builder{
    @Override
    public Builder buildMouse()
    {
        System.out.println("华硕鼠标组装");
        return this;
    }

    @Override
    public Builder buildKeyBoard()
    {
        System.out.println("华硕键盘组装");
        return this;
    }

    @Override
    public Builder buildScreen()
    {
        System.out.println("华硕屏幕组装");
        return this;
    }
}
