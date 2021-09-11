package Mediator;

import java.util.LinkedList;

public class Redis extends AbstractDatabase
{
 //给自己增加数据的方法
    @Override
    public void addData(String data)
    {
        System.out.println("====向Redis数据库增加一条数据====");
        System.out.println("增加的数据为:"+data);
        System.out.println("=====================================");
        datas.add(data);
    }
 //重新父类同步数据的方法

    @Override
    public void DataStore(String data) {
        addData(data);
        //同步数据的工作交给中介
        mediator.sync(AbstractDatabase.REDIS,data);
    }
}
