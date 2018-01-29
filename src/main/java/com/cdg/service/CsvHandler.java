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
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		int i= 0;
		for( List<String> rows: csvData){
			if ( i > 0 )  {
				UberTrip trip = new UberTrip();
				if( null != rows.get(0) && !rows.get(0).isEmpty() )
					trip.setNric(rows.get(0));
				if( null != rows.get(1) && !rows.get(1).isEmpty() )
					trip.setVehicle_id(rows.get(1));
				if( null != rows.get(2) && !rows.get(2).isEmpty() )
					trip.setStart_dt(sdf.parse(rows.get(2)));
				if( null != rows.get(3) && !rows.get(3).isEmpty() )
					trip.setEnd_dt(sdf.parse(rows.get(3)));
				if( null != rows.get(4) && !rows.get(4).isEmpty() )
					trip.setToll_fee(Double.parseDouble(rows.get(4)));
				if( null != rows.get(5) && !rows.get(5).isEmpty() )
					trip.setFare(Double.parseDouble(rows.get(5)));
				if( null != rows.get(6) && !rows.get(6).isEmpty() )
					trip.setDistance(Double.parseDouble(rows.get(6)));
				if( null != rows.get(7) && !rows.get(7).isEmpty() )
					trip.setPayment_method(rows.get(7));
				
				uberTripDAO.addUberTrip(trip);

			}

			i++;
		}
	}


	public void setUberTripDAO(UberTripDAO uberTripDAO) {
		this.uberTripDAO = uberTripDAO;
	}

}
