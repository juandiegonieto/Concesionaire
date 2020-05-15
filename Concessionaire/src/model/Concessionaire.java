package model;
import java.util.*;

public class Concessionaire {
	private String name;
	private int nit;
	private int totalEarnings;
	private int sales;
	private ArrayList<SalesAdvisor> salesAdvisors;
	private ArrayList<Client> clients;
	private ArrayList<Vehicle> vehicles;
	
	/*
	 * Constructor de la clase conscecionario y sus atributos. <br>
	 * <b>pre: </b> <br>
	 * <b>post: </b> Inicializa los atributos de la clase consecionario. <br>
	 * @param name nombre del conscesionario.
	 * @param nit Numero de itentificacion.
	 * @param totalEarnings Total de ganancias.
	 * @param sales Numero de ventas realizadas.
	 */
	public Concessionaire(String name, int nit, int totalEarnings, int sales) {
		
		this.name = name;
		this.nit = nit;
		this.totalEarnings = totalEarnings;
		this.sales = sales;
		salesAdvisors = new ArrayList<SalesAdvisor>();
		clients = new ArrayList<Client>();
		vehicles = new ArrayList<Vehicle>();
		
	}
	
	/*
	 * Getter del atributo name. <br> 
	 * <b>pre: </b> <br>
	 * <b>post: </b> Se obtiene la informacion del nombre del consecionario <br>
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * Setter del atributo name. <br>
	 * <b> pre: </b> <br>
	 * <b> post: </b> Se modifica el atributo nombre <br>
	 * @param name Nombre del concesionario
	 */
	public void setName(String name) {		
		this.name = name;	
	}
	 /*
	  * Getter del atributo nit. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se obtiene la informacion del nit, numero de identificacion <br>
	  */
	public int getNit() {
		return nit;
	}
	 /*
	  * Setter del atributo nit. <br>
	  * <b> pre: </b> <br>
	  * <b> post: </b> Se modifica el atributo nit. <br>
	  * @param nit Numero de identificacion
	  */
	public void setNit(int nit) {
		this.nit = nit;
	}
	
	/*
	 * Getter del atributo totalEarnings. <br>
	 * <b> pre: </b> <br>
	 * <b> post: </b> Se obtiene informacion del atributo totalEarnings, ganancias totales <br>
	 */
	public int getTotalEarnings() {
		return totalEarnings;
	}
	
	/*
	 * Setter del atributo totalEarnings. <br>
	 * <b> pre: </b> <br>
	 * <b> post: </b> Se modifica el atributo totalEarnings. <br>
	 * @param totalEarnings Ganancias totales
	 */
	public void setTotalEarnings(int totalEarnings) {
		this.totalEarnings = totalEarnings;
	}
	
	/*
	 * Getter del atributo sales. <br>
	 * <b> pre: </b> <br>
	 * <b> post: </b> Se obtiene informacion del atributo sales, Numero de ventas. <br>
	 */
	public int getSales() {
		return sales;
	}
	
	/*
	 * Setter del atributo sales. <br>
	 * <b> pre: </b> <br>
	 * <b> post: </b> Se modifica el atruto sales. <br>
	 * @param sales Numero de ventas realizadas del concesionario 
	 */
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	/*
	 * Añade asesores de venta al concesionario. <br>
	 * <b> pre: </b> El ArrayList salesAdvisors inicializado. <br>
	 * <b> post: </b> Añade un salesAdvisor, asesor de venta al concesionario. <br>
	 * @param salesAdvisor Asesor de venta
	 */
	public void addSalesAdvisor(SalesAdvisor salesAdvisor) {
		salesAdvisors.add(salesAdvisor);
	}
	
	/*
	 * Añade clientes al concesionario. <br>
	 * <b> pre: </b> El ArrayList clients inicializado. <br>
	 * <b> post: </b> Añade un client, cliente al concesionario. <br>
	 * @param client Cliente
	 */
	public void addClient(Client client) {
		clients.add(client);
	}
	
	/*
	 * Añade los vehiculos al concesionario. <br>
	 * <b> pre: </b> El ArrayList vehicles inicializado. <br>
	 * <b> post: </b> Añade un vehicle, vehiculo al concesionario. <br>
	 * @param vehicle Vehiculo
	 */
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	/*
	 * Calcula el precio total de venta del vehiculo. <br>
	 * <b> pre: </b> Tener el precio total y el tipo de vehiculo. <br>
	 * <b> post: </b> Se obtiene el precio total de venta del vehiculo. <br>
	 */
	public ArrayList<Vehicle> calculateTotalPriceOfSale(int totalPriceOfSale, int basePrice, String type) {
		int totalPriceOfSaleUsed;
		for(int i=0; i<vehicles.size(); i++) {
			if(vehicles.get(i).getType().equalsIgnoreCase("usado")) {
				totalPriceOfSaleUsed = (int) (vehicles.get(i).getBasePrice() - (vehicles.get(i).getBasePrice() * 0.1));
				totalPriceOfSale = vehicles.get(i).getBasePrice();
				vehicles.get(i).setTotalPriceOfSsale(totalPriceOfSaleUsed);
			} else {
				vehicles.get(i).setTotalPriceOfSsale(totalPriceOfSale);
			}
		}
		return vehicles;
	}
	 /*
	  * Se muestra la informacion de los asesores de venta. <br>
	  * <b> pre: </b> El metodo basicInfo. <br>
	  * <b> post: </b> Se muestran los datos de los asesores de ventas. <br>
	  */
	public String getInfoSalesAdvisor() {
		String info = "-Datos de los asesores de ventas-\n";
		for (int i = 0; i<salesAdvisors.size(); i++) {
			info += salesAdvisors.get(i).basicInfo();
		}
		return info;
	}
	
	 /*
	  * Se muestra la informacion de los clientes. <br>
	  * <b> pre: </b> El metodo basicInfo. <br>
	  * <b> post: </b> Se muestran los datos de los clientes. <br>
	  */
	public String getInfoClients() {
		String info = "__Datos de los Clientes__\n";
		for(int i=0; i<clients.size(); i++) {
			info += clients.get(i).basicInfo();
		}
		return info;
	}
	 /*
	  * Se muestra la informacion de los vehiculos. <br>
	  * <b> pre: </b> El metodo basicInfo. <br>
	  * <b> post: </b> Se muestran los datos de los vehiculos. <br>
	  */
	public String getInfoVehicles() {
		String info = "__Datos de los Vehiculos__\n";
		for(int i=0; i<vehicles.size(); i++) {
			info += vehicles.get(i).basicInfo();
			if(vehicles.get(i) instanceof Motorcycle || vehicles.get(i) instanceof GasolineCar) {
				info += vehicles.get(i).getFuelConsume();
			} else if(vehicles.get(i) instanceof ElectricCar) {
				info += vehicles.get(i).getBatteryConsume();
			} else if(vehicles.get(i) instanceof HybridCar) {
				info += vehicles.get(i).getFuelConsumeAndBatteryConsume();
			}
			
		}
		return info;
	}
	
}
