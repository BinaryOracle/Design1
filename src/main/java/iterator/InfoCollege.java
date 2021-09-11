package iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College{
   private List<Department> departments;

    @Override
    public void getName() {
        System.out.println("信息工程学院");
    }

    public InfoCollege(List<Department> departs)
    {
        departments=departs;
    }

    @Override
    public void addDepartment(String name, Integer score) {
       Department department=new Department(name,score);
       departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
