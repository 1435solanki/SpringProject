package com.solanki;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
 

@SpringBootApplication  
public class SpringBootMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        try {
        	 SpringApplication.run(SpringBootMain.class, args);  
             System.out.println("Main Application Successfully Started");
		} catch (Exception e) {
			//LOG.error(e.getMessage());
			System.out.println(e.getMessage());
		}
	}
}
