package com.cdg.dao;

import java.util.List;

import com.cdg.model.UberTrip;

public interface UberTripDAO {
	public void addUberTrip(UberTrip p);
    public List<UberTrip> listUberTrip();
    public UberTrip getUberTrip(int id);
}
