package command;

import com.google.common.collect.Lists;
import java.util.List;
//服务员类----发送请求(命令)者
public class Waitor
{
      //命令可能有多个
    List<Command> commadns= Lists.newArrayList();
    //将命令放入到集合中
    public void setCmd(Command cmd)
    {
        commadns.add(cmd);
    }
    //发起命令功能
    public void OrderUp()
    {
        System.out.println("订单来了.....");
        //遍历List集合
        commadns.forEach(cmd->{
            if(cmd!=null)
                //命令有效就执行
                cmd.execute();
        });
    }
}
