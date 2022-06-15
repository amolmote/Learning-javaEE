package com.cdac.in.SpringCore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.in.SpringCore.constr.Stud;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/cdac/in/SpringCore/lifecycle/lifecycleconfig.xml");
//ApplicationContext context=new ClassPathXmlApplicationContext("com/cdac/in/SpringCore/lifecycle/lifecycleconfig.xml");
//		
//Samosa s=(Samosa) context.getBean("sam1");
//System.out.println(s);

System.out.println("----------------------------------------------");
Pepsi s1=(Pepsi) context.getBean("p1");
System.out.println(s1);

//
Example ex=(Example)context.getBean("ex");
System.out.println(ex);
context.registerShutdownHook();



	}

}
