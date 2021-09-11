package Mediator;

import lombok.Setter;

import java.util.LinkedList;

public class MySql extends AbstractDatabase
{
     //向自己的数据库增加数据
    @Override
    public void addData(String data)
    {
        System.out.println("====向Mysql数据库增加一条数据====");
        System.out.println("增加的数据为:"+data);
        System.out.println("=====================================");
        datas.add(data);
    }
     //重写父类数据同步的方法
    @Override
    public void DataStore(String data)
    {
        addData(data);
       //将数据同步到redis和elasticsearch的工作由中介完成
        mediator.sync(AbstractDatabase.MYSQL,data);
    }
}
