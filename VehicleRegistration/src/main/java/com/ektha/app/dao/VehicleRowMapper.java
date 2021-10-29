package com.ektha.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ektha.app.entity.Vehicle;

@Component("vehicleRowMapper")
public class VehicleRowMapper implements RowMapper<Vehicle> {

	@Override
	public Vehicle mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Vehicle vehicle = new Vehicle();
		vehicle.setVin(resultSet.getString("vin"));
		vehicle.setManufacturer(resultSet.getString("manufacturer"));
		vehicle.setModel(resultSet.getString("model"));

		return vehicle;
	}

}
