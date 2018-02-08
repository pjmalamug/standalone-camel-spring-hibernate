package com.cdg.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cdg.dao.UberTripDAO;
import com.cdg.model.UberTrip;

public class CsvHandler {

	@Autowired
	UberTripDAO uberTripDAO;

	private static final Logger logger = LogManager.getLogger(CsvHandler.class);

	public void doHandleCsv(List<List<String>> csvData) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		List<UberTrip> ubertripList = new ArrayList<UberTrip>();

		try {
			//process here

		} catch (Exception e){
			logger.error("Exception", e);
		}
	}


	public void setUberTripDAO(UberTripDAO uberTripDAO) {
		this.uberTripDAO = uberTripDAO;
	}

}
