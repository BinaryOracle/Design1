package observer;

//处理微信订阅的业务逻辑
public class WeChatSub implements Subscriber
{
    //当前订阅者的名字
    private String subName;
    WeChatSub(String subName)
    {
        this.subName=subName;
    }
    @Override
    public void receive(String publisher, String passageName) {
       //接收到推送消息时的具体业务逻辑操作
        System.out.println(String.format("用户[%s] ,  接收到[%s]的订阅号推送," +
                "推送文章为:%s ",subName,publisher,passageName));
    }
}
