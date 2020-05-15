package model;
public abstract class Motorcycle extends Vehicle implements FuelServices{
	private String typeOfMotorcycle;
	
	public final int STANDAR_TYPE = 1;
	public final int SPORT_TYPE = 2;
	public final int SCOOTER_TYPE = 3;
	public final int CROSS_TYPE = 4;
	
	private double tankCapacity;
	
	public Motorcycle(int totalPriceOfSale, int basePrice, String brand, String model, int displacement, 
			int mileage, String type, String placa, String typeOfMotorcycle, double tankCapacity, double gasolineConsume) {
		super(totalPriceOfSale, basePrice, brand, model, displacement, mileage, type, placa);
		this.typeOfMotorcycle = typeOfMotorcycle;
		this.tankCapacity = tankCapacity;
	}
	
	public String getTypeOfMotorcycle() {
		return typeOfMotorcycle;
	}
	
	public void setTypeOfMotorcycle(String typeOfMotorcycle) {
		this.typeOfMotorcycle = typeOfMotorcycle;
	}
	
	public double getTankCapacity() {
		return tankCapacity;
	}
	
	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	
	@Override
	public String getFuelConsume() {
		String info = "Consumo de gasolina: "+calculateFuelConsume();
		return info;
	}
	
	@Override
	public double calculateFuelConsume() {
		double gasolineConsume = getTankCapacity()*(super.getDisplacement()/90);
		return gasolineConsume;
	}
}

