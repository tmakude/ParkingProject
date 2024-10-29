package ParkingSyatem;

public interface CostStrategy {
	
	 double calculateCost(VehicleType type, int hours, CurrencyType currency);

}
