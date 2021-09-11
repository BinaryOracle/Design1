package Mediator;

import lombok.Setter;

import java.util.LinkedList;

public class Elasticsearch  extends AbstractDatabase
{
    //给自己增加数据的方法
    @Override
    public void addData(String data)
    {
        System.out.println("====向Elasticsearch数据库增加一条数据====");
        System.out.println("增加的数据为:"+data);
        System.out.println("=====================================");
        datas.add(data);
    }

    //重写父类数据同步的方法
    @Override
    public void DataStore(String data) {
        addData(data);
        //数据同步
        mediator.sync(AbstractDatabase.Elasticsearch,data);
    }
}
