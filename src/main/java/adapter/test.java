package adapter;

import org.junit.Test;

public class test
{
    @Test
    public void test()
    {
        //找寻合适的变压器是第一步
        FindAdapter fa=new FindAdapter();
        //找寻可以将220v转化为5v的变压器，即适配器
        DC5Adapter adapter = fa.getPowerAdapter(new ChinaPower());
        //输出当前变压器转化之后的电压
        System.out.println(adapter.transTo5V(new ChinaPower()));
    }
}
