package adapter;

//适配器接口
public interface DC5Adapter
{
    boolean support(Power power);
    Integer transTo5V(Power power);
}
