package together;


import org.junit.Test;

public class test
{
    @Test
    public void test()
    {
        //大盘子一个
        Plate bigPlate=new Plate();
        //大盘子里面放中盘子
        Plate middlePlate=new Plate();
        bigPlate.add(middlePlate);
        Plate smallPlate=new Plate();
        //中盘子里面放小盘子
        middlePlate.add(smallPlate);
        //放水果
        MyElement a1=new Apple();
        MyElement a2=new Apple();
        MyElement a3=new Apple();
        bigPlate.add(a1);
        middlePlate.add(a2);
        smallPlate.add(a3);
        //输出
        bigPlate.eat();
    }
}
