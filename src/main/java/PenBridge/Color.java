package PenBridge;

//抽象部分的接口
public abstract class Color
{
    protected Pen pen;
    Color(){}
    public Color setPen(Integer penType)
    {
        //通过静态工厂为我们制造pen
        pen=PenFactory.getBean(penType);
        return  this;
    }
    public abstract void draw(String name);
}
