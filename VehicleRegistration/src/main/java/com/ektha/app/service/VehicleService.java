package com.ektha.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.app.dao.IVehicleDAO;
import com.ektha.app.entity.Vehicle;

@Service
public class VehicleService implements IVehicleService {

	@Autowired
	private IVehicleDAO vehicleDAO;

	@Override
	public Vehicle getVehicleInfo(String driverLicense) {

		return vehicleDAO.getVehicleInfo(driverLicense);
	}

}
