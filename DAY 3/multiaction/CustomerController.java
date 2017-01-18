package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CustomerController extends MultiActionController{
	
	public ModelAndView testAddCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		
		return new ModelAndView("CustomerPage", "msg","add() method");
			
	}
	
	public ModelAndView testDeleteCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
			
		return new ModelAndView("CustomerPage", "msg","delete() method");
				
	}
	
	public ModelAndView testUpdateCustomer(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
			
		return new ModelAndView("CustomerPage", "msg","update() method");
				
	}
	
	public ModelAndView testListCustomer(HttpServletRequest request,HttpServletResponse response) throws Exception {
				
		return new ModelAndView("CustomerPage", "msg","list() method");
					
	}
	
}