package com.ramana.common;

import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ramana.services.MessageService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("locale.xml");
	
        MessageService cust = (MessageService)context.getBean("service");
    	System.out.print("message in English : ");
    	cust.printMessage(Locale.ENGLISH);
    	
    	System.out.print("message in French : ");
    	cust.printMessage(Locale.FRANCE);
    	
    	System.out.print("message in German : ");
    	cust.printMessage(Locale.GERMAN);
    	
    	// No file available for Chenese. defaults to English
    	System.out.print("message in Chinese : ");
    	cust.printMessage(Locale.CHINA);
    	
    }
}
