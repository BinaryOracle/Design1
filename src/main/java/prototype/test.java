package prototype;

import org.junit.Test;

import java.io.IOException;

public class test
{
    @Test
    public void test() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        //创建原型对象
        Sheep sheep=new Sheep();
        sheep.setAge(3);
        sheep.setName("肖恩");
        sheep.setPig(new Pig("大忽悠",3));
        //序列化
        Sheep sheep1 = sheep.deepClone();
        Sheep sheep2 = sheep.deepClone();
        System.out.println(sheep1==sheep2);
        System.out.println(sheep1.getPig()==sheep2.getPig());
    }
}
