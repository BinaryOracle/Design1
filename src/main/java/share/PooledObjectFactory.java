package share;

import com.google.common.collect.Maps;

import java.util.Map;
//池对象工厂
public class PooledObjectFactory
{
    //工厂采用单例模式创建
    private PooledObjectFactory(){}
    private  static class SigntonInstance{
        private static final PooledObjectFactory factory=new PooledObjectFactory();
    }
   static public PooledObjectFactory getPooledObjectFactory() {
        return SigntonInstance.factory;
    }
    //使用guava创建HashMap
    Map<String,PooledObject> conPools= Maps.newHashMap();
    //获得连接池对象
    public PooledObject getConnection(String connection)
    {
     //遍历map集合，看是否存在对应的连接
     //存在直接获取
     //否则创建新连接，放入池中
        PooledObject PooledObject=null;
     if(!conPools.containsKey(connection))
     {
         PooledObject = new TcpPooledObject(connection);
         conPools.put(connection,PooledObject);
     }
     PooledObject=conPools.get(connection);
     return PooledObject;
    }
}
