package observer;
import java.util.ArrayList;
import java.util.List;
//发布者--被观察的对象Subject
public class Publisher
{
    //存放所有需要通知的观察者
   static private List<Subscriber> subscribers=new ArrayList<>();
   //记录是否发布的状态，默认false
    static private  Boolean pubStatus=false;

    protected void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    protected void unsubscribe(Subscriber subscriber) {
        if (this.subscribers.contains(subscriber)) {
            this.subscribers.remove(subscriber);
        }
    }

    protected void notifySubscribers(String publisher, String articleName) {
        if (this.pubStatus == false) {
            return;
        }
        for (Subscriber subscriber : this.subscribers) {
            subscriber.receive(publisher, articleName);
        }
        this.clearPubStatus();
    }

    protected void setPubStatus() {
        this.pubStatus = true;
    }

    protected void clearPubStatus() {
        this.pubStatus = false;
    }
}
