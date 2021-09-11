package prototype;

import javassist.bytecode.ByteArray;
import lombok.Data;

import java.io.*;

//实现Cloneable接口
@Data
public class Sheep implements Serializable
{
    private String name;
    private Integer age;
    private  Pig pig;
 //序列化方式完成深拷贝
    public Sheep deepClone() throws IOException, ClassNotFoundException {
        //先将要序列化的对象写入流中
        ByteArrayOutputStream baot=new ByteArrayOutputStream();
        //ObjectOutputStream构造函数的参数是，将对象流写入到哪里
        ObjectOutputStream oot=new ObjectOutputStream(baot);
          oot.writeObject(this);

          //将序列化的对象从流中读取出来
        ByteArrayInputStream bait=new ByteArrayInputStream(baot.toByteArray());
        ObjectInputStream oit=new ObjectInputStream(bait);
        return (Sheep) oit.readObject();
    }
}
