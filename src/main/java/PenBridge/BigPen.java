package PenBridge;

public class BigPen implements Pen{
    @Override
    public void bePainting(String colorType, String thing)
    {
        System.out.println("正在使用大毛笔绘制"+colorType+"的"+thing);
    }
}
