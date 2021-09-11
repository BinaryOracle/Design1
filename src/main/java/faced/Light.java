package faced;

public class Light
{
    //静态常量
    private static  Light  instance=new Light();;
    //构造器私有化
    private  Light(){};
  //共有静态方法，返回一个实例对象
    public  static  Light getInstance()
    {
        return instance;
    }
    public  void on()
    {
        System.out.println("灯开");
    }
    public  void  off()
    {
        System.out.println("灯关");
    }
}
