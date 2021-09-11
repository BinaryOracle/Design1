package faced;

public class GeneralSwitchFaced
{
    private Light light;
    private  Fan fan;
  public GeneralSwitchFaced()
    {
        light=Light.getInstance();
        fan=Fan.getInstance();
    }
    public void on()
    {
        light.on();
        fan.on();
    }
    public void off()
    {
        light.off();
        fan.off();
    }

}
