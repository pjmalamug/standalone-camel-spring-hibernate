package com.cdg.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cdg.dao.UberTripDAO;
import com.cdg.model.UberTrip;

public class CsvHandler {

	@Autowired
	UberTripDAO uberTripDAO;

	public void doHandleCsv(List<List<String>> csvData) throws Exception{
		
	}


	public void setUberTripDAO(UberTripDAO uberTripDAO) {
		this.uberTripDAO = uberTripDAO;
	}

}
