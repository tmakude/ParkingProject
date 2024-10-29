package ParkingSyatem;

public class Vehicle {
	
	private VehicleType type;
	private String registrationNumber;
    private String colour;
    
	public Vehicle(VehicleType type, String registrationNumber, String colour) {
		super();
		this.type = type;
		this.registrationNumber = registrationNumber;
		this.colour = colour;
	}

	

	public void setType(VehicleType type) {
		this.type = type;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public VehicleType getType() {
		return type;
	}



	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	
	

	
	
	
    
    
    
    

}
