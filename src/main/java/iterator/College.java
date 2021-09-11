package iterator;

import java.util.Iterator;

//抽象学院接口
public interface College
{
  //获取当前系的名字
    void getName();
    //增加系
    void addDepartment(String name,Integer score);
    //返回一个迭代器，负责遍历
    Iterator createIterator();
}
