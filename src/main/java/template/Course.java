package template;

//抽象课程类
public abstract class Course
{
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    //final表示子类继承后，无法修改父类该方法
    final void makePPT() {
        System.out.println("1. 制作PPT");
    }

    final void makeVideo() {
        System.out.println("2. 制作视频");
    }

    final void writeArticle() {
        System.out.println("3. 编写课程笔记");
    }

    //钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

   //抽象方法，留给子类去实现
    abstract void packageCourse();
}
