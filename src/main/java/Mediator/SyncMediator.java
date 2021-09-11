package Mediator;

public class SyncMediator extends AbstractMediator {
    @Override
    public void sync(String databaseName, String data) {
        if (AbstractDatabase.MYSQL.equals(databaseName)) {
            // mysql 同步到 redis 和 Elasticsearch
            this.redis.addData(data);
            this.elasticsearch.addData(data);
        } else if (AbstractDatabase.REDIS.equals(databaseName)) {
            // redis 缓存同步，不需要同步到其他数据库
        } else if (AbstractDatabase.Elasticsearch.equals(databaseName)) {
            // Elasticsearch 同步到 Mysql
            this.mySql.addData(data);
        }
    }
}
