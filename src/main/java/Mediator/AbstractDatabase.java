package Mediator;

import lombok.Setter;

import java.util.LinkedList;

public abstract class AbstractDatabase
{
    public static final String MYSQL="mysql";
    public static final String Elasticsearch="elasticsearch";
    public static final String REDIS="redis";
    //保存一个中介者对象
    @Setter
    protected AbstractMediator mediator;
    //存储数据
    protected LinkedList<String> datas=new LinkedList<>();
    //向自己的数据库中增加数据的方法
    public abstract void addData(String data);
    //同步数据的方法--默认空实现
    public void DataStore(String data){}
    //展示当前数据库所有数据
    public void display()
    {
        datas.forEach(x->System.out.println(x));
    }
}
