package share;

//具体享元对象
//处理Tcp连接
public class TcpPooledObject extends PooledObject
{
 //内蕴对象
    String tcpConnection=null;
    TcpPooledObject(String tcpCon)
    {
        //连接
        tcpConnection=tcpCon;
    }
    @Override
    public void ConnectOperation(String timeout)
    {
        System.out.println("连接"+tcpConnection);
        System.out.println("连接超时时间:"+timeout);
    }
}
