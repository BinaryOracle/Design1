package adapter;

//日本电压110v
public class JapenPower implements Power
{
    private final Integer output=110;
    @Override
    public Integer getOutPut() {
        return output;
    }
}
