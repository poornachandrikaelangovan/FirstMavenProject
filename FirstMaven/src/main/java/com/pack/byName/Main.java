package com.pack.byName;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class Main {

	public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("bean.xml");
		BeanFactory b=new XmlBeanFactory(resource);
	//	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Address address=(Address) b.getBean("address");
		address.print();

	}

}
