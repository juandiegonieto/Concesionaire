package model;

public class Client {

	private String name;
	private String lastName;
	private int id;
	private int telephoneNumber;
	private String email;
	private String preferences;
	
	public Client(String name, String lastName, int id, int telephoneNumber, String email, String preferences) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
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
	
	public int getTelephoneNumber() {
		return telephoneNumber;
	}
	
	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPreferences() {
		return preferences;
	}
	
	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}
	
	public String basicInfo() {
		String info = "Nombre: "+getName()+"\nApellido: "+getLastName()+"\nIdentificacion: "+getId()+"\nNumero de telefono: "
				+getTelephoneNumber()+"\nEmail: "+getEmail()+"\nVehiculos de interes: "+getPreferences();
		return info;
	}
}
