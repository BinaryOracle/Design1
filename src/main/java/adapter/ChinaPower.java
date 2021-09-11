package adapter;

//中国的电压220V
public class ChinaPower implements Power
{
    private final Integer outPut=220;
    @Override
    public Integer getOutPut() {
        return outPut;
    }
}
