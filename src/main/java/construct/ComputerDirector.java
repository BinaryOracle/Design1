package construct;

public class ComputerDirector
{
    //构建电脑的方法
    public Computer construct(Builder builder)
    {
      //构建复杂产品对象
      Computer computer=builder.
              buildMouse().
              buildKeyBoard().
              buildScreen().
              createComputer();
      return computer;
    }
}
