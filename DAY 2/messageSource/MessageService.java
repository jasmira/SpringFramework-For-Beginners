package com.ramana.services;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class MessageService implements MessageSourceAware
{
	private MessageSource messageSource;
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public void printMessage(Locale locale){
		String message = messageSource.getMessage("msg.line", 
    			new Object[] {2000}, locale);
    	System.out.println(message);
    	
	}
	
}
