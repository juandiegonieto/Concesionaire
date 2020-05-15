package model;

public abstract class HybridCar extends Car implements MixedServices{
		private int tankCapacity;
		private String typeOfGasolineCar;
		
		public final int EXTRA_GASOLINE = 1;
		public final int ORDINARY_GASOLINE = 1;
		public final int DIESEL_GASOLINE = 1;
		
		private String chargerType;
		
		public final int FAST_CHARGER = 1;
		public final int NOMRAL_CHARGER = 2;
		
		private int batteryDistance;
		
		public HybridCar (int totalPriceOfSale, int basePrice, String brand, String model,
				int displacement, int mileage, String type, String placa, String typeOfVehicle, String typeOfFuel, int doors,
				boolean tintedWindows, int tankCapacity, String typeOfGasolineCar, double gasolineConsume,
				String chargerType, int batteryDistance, int batteryConsume) {
			super(totalPriceOfSale, basePrice, brand, model, displacement, mileage, type, placa, typeOfVehicle, 
				typeOfFuel, doors, tintedWindows);
			this.tankCapacity = tankCapacity;
			this.typeOfGasolineCar = typeOfGasolineCar;
			this.chargerType = chargerType;
			this.batteryDistance = batteryDistance;	
		}
		
		public int getTankCapacity() {
			return tankCapacity;
		}
		
		public void setTankCapacity(int tankCapacity) {
			this.tankCapacity = tankCapacity;
		}
		
		public String getTypeOfGasolineCar() {
			return typeOfGasolineCar;
		}
		
		public void setTypeOfGasolineCar(String typeOfGasolineCar) {
			this.typeOfGasolineCar = typeOfGasolineCar;
		}
		
		public String getChargerType() {
			return chargerType;
		}
		
		public void setChargerType(String chargerType) {
			this.chargerType = chargerType;
		}
		
		public int getBatteryDistance() {
			return batteryDistance;
		}
		
		public void setBatteryDistance(int batteryDistance) {
			this.batteryDistance = batteryDistance;
		}
		
		@Override
		public String getFuelConsumeAndBatteryConsume() {
			String info = "Consumo de gasolina: "+calculateFuelConsume();
			info += "Consumo de bateria: "+calculateBatteryConsume();
			return info;
		}
		
		@Override
		public double calculateFuelConsume() {
			double gasolineConsume = getTankCapacity()*(super.getDisplacement()/100);
			return gasolineConsume;
		}
		
		
		
		@Override
		public double calculateBatteryConsume() {
			double batteryConsume = 0;
			if(getChargerType().equalsIgnoreCase("Rapido")) {
				batteryConsume = getBatteryDistance()*(super.getDisplacement()/100);
			} else if(getChargerType().equalsIgnoreCase("Normal")) {
				batteryConsume = (getBatteryDistance()+5)*(super.getDisplacement()/100);
			}
			return batteryConsume;
		}
}
