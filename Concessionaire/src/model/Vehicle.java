package model;
import java.util.*;

public abstract class Vehicle {

	public final int SEDAN = 1;
	public final int PICKUP = 2;
	public final int GASOLINE = 1;
	public final int HYBRID = 2;
	public final int ELECTRICAL = 3;
	
	private int totalPriceOfSale;
	private int basePrice;
	private String brand;
	private String model;
	private int displacement;
	private int mileage;
	private String type;
	private String placa;
	private ArrayList<Documents> documents;
	
	public Vehicle(int totalPriceOfSale, int basePrice, String brand, String model, int displacement, int mileage, String type, String placa) {
		this.totalPriceOfSale = totalPriceOfSale;
		this.basePrice = basePrice;
		this.brand = brand;
		this.model = model;
		this.displacement = displacement;
		this.mileage = mileage;
		this.type = type;
		this.placa = placa;
		documents = new ArrayList<Documents>();
	}
	/*
	 * Getter del precio total de venta totalPriceOfSale. <br> 
	 * <b>pre: </b> <br>
	 * <b>post: </b> Se obtiene la informacion del precio total de venta del vehiculo. <br>
	 */
	public int getTotalPriceOfSale() {
		return totalPriceOfSale;
	}
	/*
	 * Setter del atributo totalPriceOfSale. <br>
	 * <b> pre: </b> <br>
	 * <b> post: </b> Se modifica el atributo precio total de venta. <br>
	 * @param totalPriceOfSale precio total de venta del vehiculo.
	 */
	public void setTotalPriceOfSsale(int totalPriceOfSale) {
		this.totalPriceOfSale = totalPriceOfSale;
	}
	 /*
	  * Getter del atributo basePrice. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se obtiene la informacion del basePrice, precio base del vehiculo. <br>
	  */
	public int getBasePrice() {
		return basePrice;
	}
	/*
	  * Setter del atributo basePrice. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se modifica el atributo basePrice. <br>
	  * @param basePrice Precio base del vehiculo
	  */
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	/*
	  * Getter del atributo brand. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se obtiene la informacion de brand, marca del vehiculo. <br>
	  */
	public String getBrand() {
		return brand;
	}
	/*
	  * Setter del atributo brand. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se modifica el atributo brand. <br>
	  * @param brand Marca del vehiculo
	  */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/*
	  * Getter del atributo model. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se obtiene la informacion de model, modelo del vehiculo. <br>
	  */
	public String getModel() {
		return model;
	}
	/*
	  * Setter del atributo model. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se modifica el atributo model. <br>
	  * @param model Marca del vehiculo
	  */
	public void setModel(String model) {
		this.model = model;
	}
	/*
	  * Getter del atributo displacement. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se obtiene la informacion de displacement, cilindraje del vehiculo. <br>
	  */
	public int getDisplacement() {
		return displacement;
	}
	/*
	  * Setter del atributo displacement. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se modifica el atributo displacement. <br>
	  * @param displacement Cilindraje del vehiculo
	  */
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	/*
	  * Getter del atributo mileage. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se obtiene la informacion de mileage, kilometraje del vehiculo. <br>
	  */
	public int getMileage() {
		return mileage;
	}
	/*
	  * Setter del atributo mileage. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se modifica el atributo mileage. <br>
	  * @param mileage Kilometraje del vehiculo
	  */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	/*
	  * Getter del atributo type. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se obtiene la informacion de type, tipo de vehiculo. <br>
	  */
	public String getType() {
		return type;
	}
	/*
	  * Setter del atributo type. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se modifica el atributo type. <br>
	  * @param type Tipo de vehiculo.
	  */
	public void setType(String type) {
		this.type = type;
	}
	/*
	  * Getter del atributo placa. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se obtiene la informacion de placa, placa del vehiculo. <br>
	  */
	public String getPlaca() {
		return placa;
	}
	/*
	  * Setter del atributo placa. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se modifica el atributo placa. <br>
	  * @param placa Placa del vehiculo
	  */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/*
	 * Añade los documentos al vehiculo
	 * <b> pre: </b> Los documentos del vehiculo, soat y mechanicalCertificade <br>
	 * <b> post: </b> Se añaden los documentos al vehiculo. <br>
	 * @param document Documento del vehiculo
	 */
	public void addDocuments(Documents document) {
		documents.add(document);
	}
	
	public abstract String getFuelConsume();
	
	public abstract String getBatteryConsume();
	
	public abstract String getFuelConsumeAndBatteryConsume();
	
	/*
	 * Muestra la informacion del vehiculo
	 * <b> pre: </b> Los datos del vehiculo, precio total de venta, precio base, marca, modelo, cilindraje, kilometraje y tipo. <br>
	 * <b> post: </b> Cadena de la informacion del vehiculo. <br>
	 */
	public String basicInfo() {
		String info = "Precio total de venta: "+getTotalPriceOfSale()+"\nPrecio base: "+getBasePrice()+"\nMarca: "+getBrand()+"Modelo"+getModel()+"\nCilindraje: "
				+getDisplacement()+"\nKilometraje: "+getMileage()+"\nTipo"+getType();
		if(type.equalsIgnoreCase("Usado")) {
			info += "Placa: "+getPlaca();
		}
		return info;
	}
}
