package com.cdg.service;

import org.apache.camel.spring.Main;

public class App 
{

	public static void main( String[] args ) throws Exception
    {
    	
		Main main = new Main();
    	main.setApplicationContextUri("camel-context.xml");
    	main.addRouteBuilder(new UberTripRoute());
    	main.run();
    }
	
}
