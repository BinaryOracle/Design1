package iterator;

import java.util.Iterator;
import java.util.List;

//信息学院
public class InfoCollegeIterator implements Iterator
{
 //以list的方式存放系
    private List<Department> departments;
    //索引
    private  Integer index=0;

    InfoCollegeIterator(List<Department> departments)
    {
        this.departments=departments;
    }

    //判断list集合中是否还有下一个元素
    @Override
    public boolean hasNext() {
          if(index>departments.size()-1)
          {
              return false;
          }
          return true;
    }

    @Override
    public Object next() {
        return departments.get(index++);
    }

    @Override
    public void remove() {
    }
}
