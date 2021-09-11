package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class ComputerCollege implements College{
    //数组默认大小为10
    private Department[] departments=new Department[10];
    private  Integer numOfDepartment=0;//当前数组中保存的对象个数

    @Override
    public void getName() {
        System.out.println("计算机学院");
    }

    public ComputerCollege(Department[] departments)
    {
        int i=0;
        for (Department department : departments) {
            this.departments[i++]=department;
        }
    }

    @Override
    public void addDepartment(String name,Integer score)
    {
     Department department=new Department(name,score);
     departments[numOfDepartment++]=department;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
