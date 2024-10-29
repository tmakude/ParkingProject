package ParkingSyatem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floor {
	
	    private int floorNumber;
	    Map<VehicleType, List<VehicleSpace>> spaces;
	    
	    public Floor(int floorNumber, int carSpaces, int sportsCarSpaces, int truckSpaces, int busSpaces) {
	        this.floorNumber = floorNumber;
	        spaces = new HashMap<>();
	        spaces.put(VehicleType.CAR, createSpaces(VehicleType.CAR, carSpaces));
	        spaces.put(VehicleType.SPORTS_CAR, createSpaces(VehicleType.SPORTS_CAR, sportsCarSpaces));
	        spaces.put(VehicleType.TRUCK, createSpaces(VehicleType.TRUCK, truckSpaces));
	        spaces.put(VehicleType.BUS, createSpaces(VehicleType.BUS, busSpaces));
	    }
	    
	    private List<VehicleSpace> createSpaces(VehicleType type, int count) {
	        List<VehicleSpace> list = new ArrayList<>();
	        for (int i = 1; i <= count; i++) {
	            list.add(new VehicleSpace(i, type));
	        }
	        return list;
	    }
	    
	    public VehicleSpace findAvailableSpace(VehicleType type) {
	        for (VehicleSpace space : spaces.get(type)) {
	            if (space.isAvailable()) {
	                return space;
	            }
	        }
	        return null;
	    }
	    
	    public void displayStatus() {
	        System.out.println("Floor " + floorNumber + " Status:");
	        for (VehicleType type : spaces.keySet()) {
	            long availableCount = spaces.get(type).stream().filter(VehicleSpace::isAvailable).count();
	            System.out.println("Vehicle Type: " + type + ", Available Spaces: " + availableCount);
	        }
	    }

}
