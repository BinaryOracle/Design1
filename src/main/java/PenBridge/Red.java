package PenBridge;

public class Red extends Color{
    public Red() {
    }

    @Override
    public void draw(String name)
    {
          super.pen.bePainting("红色",name);
    }
}
