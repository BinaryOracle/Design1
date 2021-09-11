package bridge;

import org.junit.Test;

public class test
{
    @Test
    public void test()
    {
        //测试
        Message message=new UrgencyMessageEmail();
        message.send("嘿嘿","小朋友");
        message=new UrgencyMessageSMS();
        message.send("see you again","ly");
    }
}
