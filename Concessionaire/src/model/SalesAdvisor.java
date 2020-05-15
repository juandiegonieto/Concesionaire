package model;
public class SalesAdvisor {
	private final int CLIENTS_IN_CHARGE = 5;
	private String name;
	private String lastName;
	private int id;
	private int totalSales;
	private Client[] clients;
	
	public SalesAdvisor(String name, String lastName, int id, int totalSales) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.totalSales = totalSales;
		clients = new Client[CLIENTS_IN_CHARGE]; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getId() {
		return id; 
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getTotalSales() {
		return totalSales;
	}
	
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	
	public void addClient(String name, String lastName, int id, int telephoneNumber, 
				String email, String preferences) throws Exception {
		boolean added = false;
		Client newClient = new Client( name, lastName, id,telephoneNumber, email, preferences);
		for(int i = 0; i<CLIENTS_IN_CHARGE && !added; i++) {
			if(clients[i] == null) {
				clients[i] = newClient;
				added = true;
			}			
		}
		if(!added)
		throw new Exception("El cliente del asesor de ventas no se ha agregado.");
	}
	
	public String basicInfo() {
		String info = "Nombre: "+getName()+"\nApellido: "+getLastName()+"\nIdentificacion: "+getId()
			+"\nVentas totales realizadas: "+getTotalSales();
		for(int i = 0; i<clients.length; i++) {
			if(clients[i] != null)
				info += "\nAsesor del cliente: "+clients[i].getName();
		}
		return info;
	}
}
