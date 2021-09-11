package Guava;

import com.google.common.base.Joiner;
import java.util.Map;

import com.google.common.base.Splitter;
import org.junit.Test;

public class test
{
    @Test
    public void  testGuava()
    {
        // 内部类的引用，得到分割器，将字符串解析为map
        Splitter.MapSplitter ms = Splitter.on("#").withKeyValueSeparator(':');
        Map<String, String> ret = ms.split(new String("占道宏:李窈#大忽悠:小朋友"));
        for(String it2 : ret.keySet()){
            System.out.println(it2 + " -> " + ret.get(it2));
        }
        System.out.println("大忽悠修改了代码");
    }
}
