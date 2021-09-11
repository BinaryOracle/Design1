package iterator;
import java.util.ArrayList;
import java.util.List;
public class Test
{
    public static void main(String[] args) {
        List<College> collegeList=new ArrayList<>();
        Department[] departments=new Department[3];
        departments[0]=new Department("c++",520);
        departments[1]=new Department("java",521);
        College college=new ComputerCollege(departments);

         List<Department> departmentList=new ArrayList<>();
        departmentList.add(new Department("密码学",520));
        College college1=new InfoCollege(departmentList);

        collegeList.add(college);
        collegeList.add(college1);

        OutputImp outputImp=new OutputImp(collegeList);
        outputImp.printColleges();
    }
}
