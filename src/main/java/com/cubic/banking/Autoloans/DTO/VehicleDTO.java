package com.cubic.banking.Autoloans.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class VehicleDTO {
	@Id
	@GeneratedValue
	private long vehicleId;
	private String vehicleMake;
	private String vehicleModel;
	private String vehicheYear;
	private String vIn;
    
    
	public long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleMake() {
		return vehicleMake;
	}
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getVehicheYear() {
		return vehicheYear;
	}
	public void setVehicheYear(String vehicheYear) {
		this.vehicheYear = vehicheYear;
	}
	public String getvIn() {
		return vIn;
	}
	public void setvIn(String vIn) {
		this.vIn = vIn;
	}
    
    
}
