package com.revature.emp;

public abstract class VehicleInfo {
	private int vNumber;
	private int distanceTravelled;
	
	public VehicleInfo(int vNumber, int distanceTravelled) {
		super();
		this.vNumber = vNumber;
		this.distanceTravelled = distanceTravelled;
	}
	
	public VehicleInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public int getvNumber() {
		return vNumber;
	}

	public void setvNumber(int vNumber) {
		this.vNumber = vNumber;
	}

	public int getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(int distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}

	@Override
	public String toString() {
		return "VehicleInfo [vNumber=" + vNumber + ", distanceTravelled=" + distanceTravelled + "]";
	}
	
	public abstract double calculateExpense(int distanceTravelled);
	
	
}
