package model;

public abstract class GasolineCar extends Car implements FuelServices {
	private int tankCapacity;
	private String typeOfGasolineCar;
	
	public final int EXTRA_GASOLINE = 1;
	public final int ORDINARY_GASOLINE = 1;
	public final int DIESEL_GASOLINE = 1;
	
	public GasolineCar(int totalPriceOfSale, int basePrice, String brand, String model,
			int displacement, int mileage, String type, String placa, String typeOfVehicle, String typeOfFuel, int doors,
			boolean tintedWindows, int tankCapacity, String typeOfGasolineCar, double gasolineConsume) {
		super(totalPriceOfSale, basePrice, brand, model, displacement, mileage, type, placa, typeOfVehicle, 
			typeOfFuel, doors, tintedWindows);
		this.tankCapacity = tankCapacity;
		this.typeOfGasolineCar = typeOfGasolineCar;
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
	
	@Override
	public String getFuelConsume() {
		String info = "Consumo de gasolina: "+calculateFuelConsume();
		return info;
	}
	
	@Override
	public double calculateFuelConsume() {
		double gasolineConsume = getTankCapacity()*(super.getDisplacement()/100);
		return gasolineConsume;
	}
	
	@Override
	public String basicInfo() {
		String info = super.basicInfo();
		info += "\nCapacidad del tanque: "+getTankCapacity()+"\nTipo de gasolina: "+getTypeOfGasolineCar();
		return info;
	}
}
