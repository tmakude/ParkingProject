package ParkingSyatem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
	
	 private List<Floor> floors;
	    private CostStrategy costStrategy;
	    private CurrencyType currency;

	    public ParkingLot(int numFloors, int carSpaces, int sportsCarSpaces, int truckSpaces, int busSpaces) {
	        floors = new ArrayList<>();
	        for (int i = 1; i <= numFloors; i++) {
	            floors.add(new Floor(i, carSpaces, sportsCarSpaces, truckSpaces, busSpaces));
	        }
	    }

	    public void setCostStrategy(CostStrategy costStrategy, CurrencyType currency) {
	        this.costStrategy = costStrategy;
	        this.currency = currency;
	    }

	    public String addVehicle(Vehicle vehicle) {
	        for (Floor floor : floors) {
	            VehicleSpace space = floor.findAvailableSpace(vehicle.getType());
	            if (space != null) {
	                space.parkVehicle(vehicle);
	                return "TokenID-" + vehicle.getRegistrationNumber();
	            }
	        }
	        return "Parking Full!";
	    }

	    public String removeVehicle(String tokenId, int hours) {
	        String regNumber = tokenId.split("-")[1];
	        for (Floor floor : floors) {
	            for (VehicleType type : VehicleType.values()) {
	                for (VehicleSpace space : floor.spaces.get(type)) {
	                    if (space.getVehicle() != null &&
	                        space.getVehicle().getRegistrationNumber().equals(regNumber)) {
	                        double cost = costStrategy.calculateCost(space.getVehicleType(), hours, currency);
	                        space.removeVehicle();
	                        return "Vehicle with Token ID " + tokenId + " exited. Total Cost: " + cost + " " + currency;
	                    }
	                }
	            }
	        }
	        return "Vehicle not found!";

}
	    public void checkAvailability(int floorNumber, VehicleType type) {
	        Floor floor = floors.get(floorNumber - 1);
	        floor.displayStatus();
	    }

	    public void displayStatus() {
	        for (Floor floor : floors) {
	            floor.displayStatus();
	        }
	    }

		
}
