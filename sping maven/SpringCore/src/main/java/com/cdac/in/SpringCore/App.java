package com.cdac.in.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        
        		Student stud=(Student)context.getBean("stud1");
        		
        		System.out.println(stud.getStudId());
        		System.out.println(stud.getStudName());
        		System.out.println(stud.getStudAddress());
        		
        		System.out.println(stud);

        		Emp e=(Emp)context.getBean("emp1");
        		System.out.println(e);
        		
        		
    }
}
