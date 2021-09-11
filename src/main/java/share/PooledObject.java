package share;

//池对象
//将其包裹成可被池管理的对象。
public abstract class PooledObject
{
    //进行连接操作
    public abstract void ConnectOperation(String con);
}
