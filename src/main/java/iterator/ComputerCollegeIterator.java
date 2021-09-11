package iterator;

import java.util.Arrays;
import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    //以数组的方式存放计算机学院下面的各个系
    private Department[] departments;
    //当前遍历到的位置
    private  Integer position=0;

    public ComputerCollegeIterator(Department[] departments)
    {
        this.departments=departments;
    }

    //判断是否还存在下一个元素
    @Override
    public boolean hasNext() {
        if(position>departments.length-1||departments[position]==null)
        {
            return false;
        }
        return true;
    }

    //返回下一个元素
    @Override
    public Object next() {
        return departments[position++];
    }

    //删除的方法默认空实现
    @Override
    public void remove()
    {}
}
