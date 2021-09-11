package decorator;


public abstract class Drink
{
   protected String decription="";//描述
   public String getDecription() {
      return decription;
   }
   public abstract Integer cost();//返回饮料的价格
}
