package com.cdg.service;

import org.apache.camel.builder.RouteBuilder;

public class UberTripRoute extends RouteBuilder {
	
	@Override
	public void configure() throws Exception { 
		from("{{start.startpoint}}")
		.to("{{start.backupoint}}")
		.unmarshal().csv()
		.to("bean:csvHandler?method=doHandleCsv")
		.end();
	}
}
