package construct;

import lombok.SneakyThrows;
import org.junit.Test;

import java.util.Calendar;

public class test
{
    @SneakyThrows//异常抛出throw,一个简单的try...catch写法
    @Test
    public void test()
    {
       //获得建造指挥官
        ComputerDirector computerDirector=new ComputerDirector();
      //创建电脑
        Class<?> dcb = Class.forName("construct.DellComputerBuilder");
        computerDirector.construct((Builder) dcb.newInstance());
        Class<?> acb = Class.forName("construct.ASUSComputerBuilder");
        computerDirector.construct((Builder) acb.newInstance());
    }
}
