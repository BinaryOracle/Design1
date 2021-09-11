package observer;

//订阅者---观察者
public interface Subscriber
{
    //接收发布者发布消息的方法
    public void receive(String publisher,String passageName);
}
