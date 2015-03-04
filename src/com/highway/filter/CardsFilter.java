package com.highway.filter;
import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CardsFilter implements Filter{  
	  
    public void destroy() {  
          
    }  
  
    public void doFilter(ServletRequest req, ServletResponse res,  
            FilterChain chain) throws IOException, ServletException {  
        HttpServletRequest request = (HttpServletRequest)req;  
        HttpServletResponse response = (HttpServletResponse)res;  
        HttpSession session = request.getSession();  
        String uri = request.getRequestURI();  
       
            if(uri.contains("/card.jsp")){  
            	List cards = (List)session.getAttribute("uCards");
            	if(cards==null){
            		response.sendRedirect("/highway/highway/index.jsp");  
            	}else{
            		response.sendRedirect("/highway/card/selectCard");
            	}
                return;  
            }  
         
        try{  
            chain.doFilter(req, res);  
        }catch(IllegalStateException e){  
        }  
    }  
  
    public void init(FilterConfig arg0) throws ServletException {  
          
    }  
  
}  
