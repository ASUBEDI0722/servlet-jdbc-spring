package com.ektha.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ektha.app.entity.Customer;
import com.ektha.app.entity.Vehicle;
import com.ektha.app.service.IVehicleService;

@Controller
public class VehicleController {

	@Autowired
	private IVehicleService vehicleService;

	
	/**
	 * This method gets vehicle information based on the customers drivers license
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getVehicleInfo", method = RequestMethod.POST)
	public ModelAndView getVehicleInfo(HttpServletRequest request) {
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String driverLicense = request.getParameter("dlnumber");

		/*
		 * Customer customer = new Customer(); customer.setFirstName(firstName);
		 * customer.setLastName(lastName); customer.setDriverLicense(driverLicense);
		 */

		Vehicle vehicle = vehicleService.getVehicleInfo(driverLicense);

		ModelAndView modelAndView = new ModelAndView("view");
		modelAndView.addObject("vehicle", vehicle);

		return modelAndView;

	}

}
