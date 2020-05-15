package model;

public abstract class Car extends Vehicle {
private String typeOfVehicle;
	
	public final int SEDAN = 1;
	public final int PICKUP = 2;
	
	private int doors;
	private boolean tintedWindows;
	private String typeOfFuel;
	
	public final int GASOLINE = 1;
	public final int HYBRID = 2;
	public final int ELECTRICAL = 3;
	
	public Car(int totalPriceOfSale, int basePrice, String brand, String model, int displacement, int mileage, String type, String placa, String typeOfVehicle, String typeOfFuel, int doors, boolean tintedWindows) {
		super(totalPriceOfSale, basePrice, brand, model, displacement, mileage, type, placa);
		this.typeOfVehicle = typeOfVehicle;
		this.typeOfFuel = typeOfFuel;
		this.doors = doors;
		this.tintedWindows = tintedWindows;
	}
	
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public boolean getTintedWindows() {
		return tintedWindows;
	}
	
	public void setTintedWindows(boolean tintedWindows) {
		this.tintedWindows = tintedWindows;
	}
	
	public String getTypeOfFuel() {
		return typeOfFuel;
	}
	
	public void setTypeOfFuel(String typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}
	
	@Override
	public abstract String getFuelConsume();
	
	@Override
	public abstract String getBatteryConsume();
	
	@Override
	public abstract String getFuelConsumeAndBatteryConsume();
	
	@Override
	public String basicInfo() {
		String info = super.basicInfo();
		info += "\nTipo de vehiculo: "+getTypeOfVehicle()+"\nNumero de puertas: "+getDoors()+"\nPolarizado de las ventanas: "+getTintedWindows()+"\nTipo de gasolina: "+getTypeOfFuel();
		return info;
	}
}
