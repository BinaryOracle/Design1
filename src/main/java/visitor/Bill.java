package visitor;

//Elemnet接口类
//抽象账本类
public interface Bill
{
    //accept
     void accept(AccountBookViewer accountBookViewer);
}
