/**
 * @author priya singh
 *This is a simple Spring core project to Implement the
 *Setter Injection.
 * 
 */


package com.springcore;

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
    	//ApplicationContext providing configuration
    	ApplicationContext bf=new ClassPathXmlApplicationContext("spring.xml");
    	//creating an object of developer class
    	developer dev=(developer) bf.getBean(developer.class);
    	//Here call the method(coding) which is part of developer class
        dev.coding();
        System.out.println("first dev Name is: "+dev.getDevName());
    }
}
