package faced;

public class Fan 
{
    private Fan(){}
    private static  Fan instance;
    //静态代码块中创建单例对象
    static {
        instance=new Fan();
    }
    public static  Fan getInstance()
    {
        return instance;
    }
    public void on()
    {
        System.out.println("风扇开");
    }
    public  void off()
    {
        System.out.println("风扇关");
    }
}
