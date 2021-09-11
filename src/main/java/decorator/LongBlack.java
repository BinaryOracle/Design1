package decorator;

public class LongBlack extends Coffee
{
    LongBlack()
    {
        decription="美式咖啡";
    }

    @Override
    public Integer cost() {
        return 15;
    }
}
