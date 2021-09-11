package Mediator;

import lombok.Data;

//抽象中介者
@Data
public abstract class AbstractMediator {
    protected MySql mySql;
    protected Elasticsearch elasticsearch;
    protected Redis redis;

    public abstract void sync(String databaseName, String data);
}
