package com.revature.emp;

public class DieselVehicle extends VehicleInfo {
	
	@Override
	public double calculateExpense(int distanceTravelled) {
		// TODO Auto-generated method stub
		return 92*distanceTravelled;
	}
	
//	public double calculateExpense(int distanceTravelled)
//	{
//		return 92*distanceTravelled;
//	}
	
	
}
