package PenBridge;

import org.junit.Test;

public class test
{
    @Test
    public void test()
    {
       //首先获取对应的Bean实例
        Color color = (Color)XmlUtil.getBean("color");
         Pen p=(Pen)XmlUtil.getBean("pen");
         color.setPen(2).draw("小朋友");
    }
}
