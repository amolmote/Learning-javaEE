package com.cdac.in.SpringCore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/cdac/in/SpringCore/collection/collectionconfig.xml");
		 
		 Emp e= (Emp) context.getBean("emp");
		 System.out.println(e.getEmpName());
		 System.out.println(e.getPhones());
		 System.out.println(e.getAddresses());
		 System.out.println(e.getCourses());
		 System.out.println(e);
	}

}
