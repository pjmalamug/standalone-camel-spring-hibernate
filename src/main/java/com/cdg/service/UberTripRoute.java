package com.cdg.service;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.csv.CsvDataFormat;

public class UberTripRoute extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		
		CsvDataFormat csv = new CsvDataFormat();
		csv.setSkipHeaderRecord(true);
		
		from("{{start.startpoint}}")
		.to("{{start.backupoint}}")
		.unmarshal(csv)
		.to("bean:csvHandler?method=doHandleCsv")
		.end();
	}
}
