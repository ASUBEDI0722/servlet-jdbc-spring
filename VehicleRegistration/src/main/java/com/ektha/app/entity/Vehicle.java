package com.ektha.app.entity;

public class Vehicle {

	private String vin;
	private String manufacturer;
	private String model;
	private String driverLicense;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	@Override
	public String toString() {
		return "Vehicle [vin=" + vin + ", manufacturer=" + manufacturer + ", model=" + model + ", driverLicense="
				+ driverLicense + "]";
	}

}
