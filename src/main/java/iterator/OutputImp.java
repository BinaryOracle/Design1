package iterator;
import java.util.Iterator;
import  java.util.List;

public class OutputImp
{
 //学院集合
 private List<College> collegeList;

 public OutputImp(List<College> collegeList)
 {
     this.collegeList=collegeList;
 }
 //输出所有学院，以及学院下面的所有系
    public  void printColleges()
    {
        //获取到遍历学院集合需要用到的迭代器
        //list集合实现了iterator接口
        Iterator<College> collegeIterator = collegeList.iterator();
        while(collegeIterator.hasNext())
        {
            College college = collegeIterator.next();
            System.out.println("当前学院:");
            college.getName();
            System.out.println("当前学院下面的系:");
            //如果要遍历当前学院下面的所有系，需要获取对应的迭代器
            printDeparts(college.createIterator());
            System.out.println("=============================");
        }
    }
 //输出当前学院的所有系
 protected void printDeparts(Iterator iterator)
 {
     while(iterator.hasNext())
     {
         Department department=(Department)iterator.next();
         System.out.println(department.getName());
     }
 }
}
