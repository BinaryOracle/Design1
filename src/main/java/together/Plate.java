package together;

import com.google.common.collect.Lists;

import java.util.ArrayList;

public class Plate extends MyElement {
    //使用guava创建集合
    private ArrayList list = Lists.newArrayList();

    public void add(MyElement element) {
        list.add(element);
    }

    public void delete(MyElement element) {
        list.remove(element);
    }

    public void eat() {
        for (Object object : list) {
            ((MyElement) object).eat();    //递归
        }
    }
}
