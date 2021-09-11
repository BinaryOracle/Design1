package PenBridge;

//简单工厂
public class PenFactory
{
    static public Pen getBean(Integer type)
    {
        switch (type)
        {
            case 1:
               return new BigPen();
            case 2:
                return new MiddlePen();
            case 3:
                return new SmallPen();
        }
        return null;
    }
}
