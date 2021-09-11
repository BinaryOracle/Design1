package adapter;

import java.util.HashSet;
import java.util.Set;

//手机需要5v的电压进行充电
public class FindAdapter
{
    //存放所有适配器的set集合
    private static final Set<DC5Adapter> DC5Adapters=new HashSet<>();
    //通过静态代码块进行初始化操作
    static
    {
        DC5Adapters.add(new ChinaAdapter());
        DC5Adapters.add(new JapenAdapter());
    }
    // 根据电压找合适的变压器
    public DC5Adapter getPowerAdapter(Power power)
    {
        DC5Adapter dc5Adapter=null;
        for(DC5Adapter da:DC5Adapters)
        {
            //如果遍历到当前电压合适的变压器就直接退出遍历
            if(da.support(power))
            {
                dc5Adapter=da;
                break;
            }
        }
        //如果遍历完所有的变压器都没有找到合适的，就抛出异常
        if(dc5Adapter==null)
        {
            throw  new IllegalArgumentException("未能找到合适的变压器");
        }
        //返回找到的合适的变压器
        return dc5Adapter;
    }
}
