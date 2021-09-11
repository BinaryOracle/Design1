package PenBridge;

public class MiddlePen implements  Pen{
    @Override
    public void bePainting(String colorType, String thing) {
        System.out.println("正在使用中毛笔绘制"+colorType+"的"+thing);
    }
}
