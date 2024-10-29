package TestPraking;

import ParkingSyatem.CurrencyType;
import ParkingSyatem.FlatRateCostStrategy;
import ParkingSyatem.ParkingLot;
import ParkingSyatem.Vehicle;
import ParkingSyatem.VehicleType;

public class MainParkingClass {

	public static void main(String[] args) {

		  ParkingLot parkingLot = new ParkingLot(2, 5, 2, 1, 1);
	

	        Vehicle car1 = new Vehicle(VehicleType.CAR, "MH-12-XY-1234", "Red");
	        Vehicle car2 = new Vehicle(VehicleType.CAR, "MH-12-XY-5678", "Blue");

	        String token1 = parkingLot.addVehicle(car1);
	        String token2 = parkingLot.addVehicle(car2);

	        parkingLot.displayStatus();

	        System.out.println(parkingLot.removeVehicle(token1, 3));
	        parkingLot.displayStatus();

	}

}
