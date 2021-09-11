package adapter;

//该适配器负责将中国的220v电压转化为5v的电压
public class ChinaAdapter implements DC5Adapter
{
    //当前适配器只负责将220v电压转化为5v的功能实现
    private  static Integer voltage=220;
    //判断当前适配器能否胜任传入power电压的转化职责
    @Override
    public boolean support(Power power)
    {
      if(power.getOutPut().equals(voltage))
      return true;
      return false;
    }
    //将220v电压转换为5v的
    @Override
    public Integer transTo5V(Power power)
    {
        //获得被适配类，即我们需要将220v电压转化为5v返回
        Integer output=power.getOutPut();
        //进行电压转换操作
        return output/44;
    }
}
