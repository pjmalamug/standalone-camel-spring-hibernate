package com.cdg.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="UBTB_TRIP_DETAILS")
public class UberTrip implements Serializable {

		
	@Id
    @Column(name="trip_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
    	generator = "ubertrip_seq")
	@SequenceGenerator(name = "ubertrip_seq", 
		sequenceName = "UBSQ_TRIP_DETAILS__ID",allocationSize=1)
	private int trip_id;
	
	private String nric;
	
	private String vehicle_id;
	
	private Date start_dt;
	
	private Date end_dt;
	
	private Double toll_fee;
	
	private Double fare;
	
	private Double distance;
	
	private String payment_method;
	
	
	private String trip_identification_number;
	private static final long serialVersionUID = 1L;
	
	public int getTrip_id() {
		return trip_id;
	}
	public void setTrip_id(int trip_id) {
		this.trip_id = trip_id;
	}
	public String getNric() {
		return nric;
	}
	public void setNric(String nric) {
		this.nric = nric;
	}
	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public Date getStart_dt() {
		return start_dt;
	}
	public void setStart_dt(Date start_dt) {
		this.start_dt = start_dt;
	}
	public Date getEnd_dt() {
		return end_dt;
	}
	public void setEnd_dt(Date end_dt) {
		this.end_dt = end_dt;
	}
	public double getToll_fee() {
		return toll_fee;
	}
	public void setToll_fee(Double toll_fee) {
		this.toll_fee = toll_fee;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public String getTrip_identification_number() {
		return trip_identification_number;
	}
	public void setTrip_identification_number(String trip_identification_number) {
		this.trip_identification_number = trip_identification_number;
	}
	
	
	
}
