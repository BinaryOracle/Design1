package share;

public class Test
{
    @org.junit.Test
    public void test()
    {
       //获取连接池工厂
        PooledObjectFactory factory=PooledObjectFactory.getPooledObjectFactory();
        PooledObject mysqlConnection = factory.getConnection("mysql");
        PooledObject oracleConnection = factory.getConnection("oracle");
        PooledObject mysqlConnection2=factory.getConnection("mysql");
        System.out.println(mysqlConnection==mysqlConnection2);
        mysqlConnection.ConnectOperation("1000");
        oracleConnection.ConnectOperation("2000");
    }
}
