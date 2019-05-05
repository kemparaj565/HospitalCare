package com.hospitalcare.www.hospitalcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalcare.www.hospitalcare.entity.*;

/**
 * Hello world!
 *
 */

@SpringBootApplication(scanBasePackages="com.hospitalcare.www.hospitalcare")
public class App 
{
	final private Staff staff=null;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class,args);
        System.out.println( "Hello World!" );
    }
}
