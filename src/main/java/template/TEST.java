package template;

public class TEST
{
    public static void main(String[] args) {
                System.out.println("Java课程start---");
                Course javaCourse = new JavaCourse();
                javaCourse.makeCourse();
                System.out.println("Java课程end---\n");


                System.out.println("前端课程start---");
                Course feCourse = new FECourse(false);
                feCourse.makeCourse();
                System.out.println("前端课程end---");
    }
}
