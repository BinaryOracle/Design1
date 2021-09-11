package decorator;

public class ChinaBlack extends Coffee
{
    ChinaBlack()
    {
        decription="中式咖啡";
    }

    @Override
    public Integer cost() {
        return 10;
    }
}
