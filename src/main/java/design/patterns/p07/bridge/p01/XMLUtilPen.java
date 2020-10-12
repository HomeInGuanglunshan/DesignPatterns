package design.patterns.p07.bridge.p01;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtilPen {

	//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean(String args) {
		try {
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File(XMLUtilPen.class.getResource("configPen.xml").getFile()));
			NodeList nl = null;
			Node classNode = null;
			String cName = null;
			nl = doc.getElementsByTagName("className");

			if (args.equals("color")) {
				//获取包含类名的文本节点
				classNode = nl.item(0).getFirstChild();

			} else if (args.equals("pen")) {
				//获取包含类名的文本节点
				classNode = nl.item(1).getFirstChild();
			}

			cName = classNode.getNodeValue();
			//通过类名生成实例对象并将其返回
			String fullName = new StringBuilder().append(XMLUtilPen.class.getPackage().getName()).append(".")
					.append(cName).toString();
			Class<?> c = Class.forName(fullName);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
