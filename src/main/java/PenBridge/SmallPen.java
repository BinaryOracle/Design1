package PenBridge;

public class SmallPen implements Pen{
    @Override
    public void bePainting(String colorType, String thing) {
        System.out.println("正在使用小毛笔绘制"+colorType+"的"+thing);
    }
}
