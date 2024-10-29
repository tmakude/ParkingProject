package ParkingSyatem;

public class VehicleSpace {
	
	private int spaceNumber;
    private boolean isAvailable;
    private VehicleType vehicleType;
    private Vehicle vehicle;
    
	public VehicleSpace(int spaceNumber, VehicleType vehicleType) {
		super();
		this.spaceNumber = spaceNumber;
		this.vehicleType = vehicleType;
		this.isAvailable = true;
	}
    
	//Park The vahicle in vehicle space
	public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isAvailable = false;
    }
	
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	//Remove The vahicle in vehicle space
	public void removeVehicle() {
        this.vehicle = null;
        this.isAvailable = true;
    }
    
	public Vehicle getVehicle() {
        return vehicle;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    


}
