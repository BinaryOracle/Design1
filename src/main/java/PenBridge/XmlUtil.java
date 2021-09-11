package PenBridge;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

//使用java反射创建具体的颜色和画笔
public class XmlUtil
{
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean(String args)
    {
        // DocumentBuilderFactory是一个抽象工厂类
        //创建 DOM 解析器的工厂
        DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
        try {
            //得到 DOM 解析器对象
            DocumentBuilder db = dFactory.newDocumentBuilder();
            //把要解析的 XML 文档转化为输入流，以便 DOM 解析器解析它
            Document document = db.parse(new File("src/main/resources/config.xml"));
           //创建一个存放节点对象的集合
            NodeList nodeList=null;
            nodeList = document.getElementsByTagName("className");
            //根据传入的args参数，来返回不同的实例镀锡
            Node node=null;
            if(args.equals("color"))
            {
                //获取包含类名的文本节点
                node = nodeList.item(0).getFirstChild();
            }
            else if(args.equals("pen"))
            {
                //获取包含类名的文本节点
                node = nodeList.item(1).getFirstChild();
            }
            //获取节点的文本值
            String value = node.getNodeValue();
            //反射创建对象
            return Class.forName("PenBridge." + value).newInstance();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
