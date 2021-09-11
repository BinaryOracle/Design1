package Mediator;

public class Client
{
    public static void main(String[] args) {
        AbstractMediator mediator=new SyncMediator();


        Elasticsearch elasticsearch=new Elasticsearch();
        MySql mySql=new MySql();
        Redis redis=new Redis();


        elasticsearch.setMediator(mediator);
        mySql.setMediator(mediator);
        redis.setMediator(mediator);

        mediator.setMySql(mySql);
        mediator.setElasticsearch(elasticsearch);
        mediator.setRedis(redis);


        //增加数据
        mySql.DataStore("大忽悠");
        elasticsearch.DataStore("李窈");
        redis.DataStore("小朋友");
        System.out.println("mysql数据库中的数据如下：");
        mySql.display();
        System.out.println("elasticsearch数据库中的数据如下:");
        elasticsearch.display();
        System.out.println("redis数据库中数据如下:");
        redis.display();
    }
}
