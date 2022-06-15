package com.cdac.in.SpringCore.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/cdac/in/SpringCore/constr/constconfig.xml");
		
		Stud s=(Stud) context.getBean("stud1");
		System.out.println(s);
		
		Addition a=(Addition) context.getBean("add1");
		a.dosum();
	}

}
