package observer;

//客户端
public class Client
{
    public static void main(String[] args) {
        //创建一个发布者
        WeChatPublisher dhy=new WeChatPublisher("大忽悠");
        //创建订阅者
        Subscriber sub1=new WeChatSub("小朋友");
        Subscriber sub2=new WeChatSub("小忽悠");
        Subscriber sub3=new WeChatSub("大朋友");
        //订阅大忽悠公众号
        dhy.subscribe(sub1);
        dhy.subscribe(sub2);
        dhy.subscribe(sub3);
        //大忽悠发布推送
        dhy.publishArticles("设计模式","观察者模式");
    }
}
