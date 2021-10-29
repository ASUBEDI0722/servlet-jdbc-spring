package com.ektha.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ektha.app.entity.Vehicle;

@Repository
public class VehicleDAO implements IVehicleDAO {

	private static String SQL_SELECT_VEHICLE = "select vin, manufacturer, model from vehicleregistration.vehicle v join vehicleregistration.customer c where v.driverlicense= c.driverlicense and v.driverlicense = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private VehicleRowMapper vehicleRowMapper;

	@Override
	public Vehicle getVehicleInfo(String driverLicense) {

		Vehicle vehicle = jdbcTemplate.queryForObject(SQL_SELECT_VEHICLE, vehicleRowMapper, driverLicense);

		return vehicle;
	}

}
