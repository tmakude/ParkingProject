package ParkingSyatem;

import java.util.HashMap;
import java.util.Map;

public class FlatRateCostStrategy implements CostStrategy {
	
	 private Map<VehicleType, Double> rateMap;
	 
	 
		public FlatRateCostStrategy() {
			super();
			rateMap = new HashMap<>();
			rateMap.put(VehicleType.CAR, 20.0);
			rateMap.put(VehicleType.SPORTS_CAR, 25.0);
			rateMap.put(VehicleType.TRUCK, 30.0);
			rateMap.put(VehicleType.BUS, 30.0);
		}




	@Override
	public double calculateCost(VehicleType type, int hours, CurrencyType currency) {
		
		double baseAmount = rateMap.get(type) * hours;
		
		if(currency == CurrencyType.USD)
		{
			return baseAmount/ 84 ;
		}
		else if (currency == CurrencyType.EUR)
		{
			return baseAmount/ 90 ;
		}
		
		return baseAmount;
	}

}
