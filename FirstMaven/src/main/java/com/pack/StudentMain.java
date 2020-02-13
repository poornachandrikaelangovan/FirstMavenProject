package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class StudentMain {

	public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("stud.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Student student=(Student) factory.getBean("studentname");
		student.display();

	}

}
