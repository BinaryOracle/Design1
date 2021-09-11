package com.BeanUtils;
import com.foodAnnotion.Food;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//扫描com包下面标注了food注解的类，放入一个map集合中
public class BeanUtils
{
 private Map<String,Object> InstanceObjects=new HashMap<>();
 public BeanUtils()
 {
     //扫描注解，放入Map集合中
     Reflections f=new Reflections("com");
     //获得所有标注了food注解的类
     Set<Class<?>> classes = f.getTypesAnnotatedWith(Food.class);
     //循环，生成一个实例，放入map集合中
     classes.forEach(bean->
     {
         Object beanInstance=null;
         try {
             beanInstance=bean.newInstance();
             //获得类上面标注的注解接口的实现对象
             Food foodAnno = bean.getAnnotation(Food.class);
             String beanName = foodAnno.value();
             //放入Map集合中
             InstanceObjects.put(beanName,beanInstance);
         } catch (InstantiationException e) {
             e.printStackTrace();
         } catch (IllegalAccessException e) {
             e.printStackTrace();
         }
     });
 }
 //获得指定Bean
    public Object getBean(String beanName)
    {
        return InstanceObjects.get(beanName);
    }
}
