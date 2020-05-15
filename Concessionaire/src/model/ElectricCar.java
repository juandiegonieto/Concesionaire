package model;


public abstract class ElectricCar extends Car implements BatteryServices {
	private String chargerType;
	
	public final int FAST_CHARGER = 1;
	public final int NOMRAL_CHARGER = 2;
	
	private int batteryDistance;
	
	public ElectricCar(int totalPriceOfSale, int basePrice, String brand, String model,
			int displacement, int mileage, String type, String placa, String typeOfVehicle, String typeOfFuel, int doors,
			boolean tintedWindows, int tankCapacity, String typeOfGasolineCar, double gasolineConsume,
			String chargerType, int batteryDistance, int batteryConsume) {
		super(totalPriceOfSale, basePrice, brand, model, displacement, mileage, type, placa, typeOfVehicle, 
			typeOfFuel, doors, tintedWindows);
		this.chargerType = chargerType;
		this.batteryDistance = batteryDistance; 
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
	public String getBatteryConsume() {
		String info = "Consumo de bateria: "+calculateBatteryConsume();
		return info;
	}
	
	@Override
	public double calculateBatteryConsume() {
		double batteryConsume = 0;
		if(getChargerType().equalsIgnoreCase("Rapido")) {
			batteryConsume = (getBatteryDistance()+10)*(super.getDisplacement()/100);
		} else if(getChargerType().equalsIgnoreCase("Normal")) {
			batteryConsume = (getBatteryDistance()+15)*(super.getDisplacement()/100);
		}
		return batteryConsume;
	}
	
	@Override
	public String basicInfo() {
		String info = super.basicInfo();
		info += "\nTipo de cargador: "+getChargerType()+"\nDistancia de la bateria: "+getBatteryDistance();
		return info;
	}
}
