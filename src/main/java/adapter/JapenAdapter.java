package adapter;

//该适配器负责将日本的110v电压转化为5v的电压
public class JapenAdapter implements DC5Adapter
{
    //当前适配器只负责将110v电压转化为5v的功能实现
    private  static Integer voltage=110;
    //判断是否支持将日本110v电压转化为5v电压的操作
    @Override
    public boolean support(Power power) {
        if(power.getOutPut()==voltage)
            return true;
        return false;
    }
    //将110v电压转换为5v的
    @Override
    public Integer transTo5V(Power power)
    {
        //获得被适配类，即我们需要将110v电压转化为5v返回
        Integer output=power.getOutPut();
        //进行电压转换操作
        return output/22;
    }
}
