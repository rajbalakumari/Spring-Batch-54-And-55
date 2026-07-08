package com.nit;

public class InsuranceFactory {

	public static Insurance getInsurance(String type) {

		if (type.equalsIgnoreCase("car")) {
			return new CarInsurance();
		}
		else if (type.equalsIgnoreCase("bike")) {
			return new BikeInsurance();
		}
		else if (type.equalsIgnoreCase("commercial")) {
			return new CommercialVehicleInsurance();
		}
		return null;
	}
}
