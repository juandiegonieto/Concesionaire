package ui;
import model.Client;
import model.Concessionaire;
import model.Documents;
import model.SalesAdvisor;
import model.Vehicle;
import java.util.*;
public class Menu {

	private final int NEW_CLIENT = 1;
	private final int NEW_SALES_ADVISOR = 2;
	private final int NEW_VEHICLE = 3;
	private final int INFO_SALES_ADVISOR = 4;
	private final int INFO_CLIENT = 5;
	private final int INFO_VEHICLE = 6;
	private final int CALCULATE_PRICE = 7;
	private final int EXIT = 8;
	
	private Concessionaire concessionaire;
	
	public Menu() {
		this.concessionaire = readinitialData();
	}
	
	public Concessionaire readinitialData() {
		Scanner in = new Scanner(System.in);
		System.out.println("");
		System.out.println("***********Concesionario***********");
		System.out.println("Datos de la empresa: ");
		System.out.println("Nombre: \n");
		String name = in.nextLine();
		System.out.println("Numero de identificación: \n");
		int nit = in.nextInt();
		in.nextLine();
		System.out.println("Ganacias totales de la empresa: \n");
		int totalEarnings = in.nextInt();
		in.nextLine();
		System.out.println("Numero de ventas: ");
		int sales = in.nextInt();
		in.nextLine();
		Concessionaire concessionaire = new Concessionaire(name, nit, totalEarnings, sales);
		return concessionaire;
	}
	
	/*Muestra el menu. <br>
	*<b>pre: </b> <br>
	*<b>post: </b>  El menu del usuario. <br>
	*@param
	*/
	public void showMenu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~Menu~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("(1) Ingresar nuevo cliente");
		System.out.println("(2) Ingresar Asesor de ventas.");
		System.out.println("(3) Ingresar un nuevo vehiculo");
		System.out.println("(4) Mostrar informacion de asesores de ventas.");
		System.out.println("(5) Mostrar informacion de los clientes.");
		System.out.println("(6) Mostrar informacion de los vehiculos.");
		System.out.println("(7) Precio de vehiculo.");
		System.out.println("(8) Salir.");
	}
	/*Lee la respuesta del menu. <br>
	*<b>pre: </b> <br>
	*<b>post: </b> Respuesta del menu. <br>
	*@param
	*/
	public int readAnswer() {
		Scanner in = new Scanner(System.in);
		int answer = in.nextInt();
		return answer;
	}
	
	public SalesAdvisor plusSalesAdvisor() {
		Scanner in = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("------------Nuevo Vendedor----------");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("Nombre: ");
		String name = in.nextLine();
		System.out.println("");
		System.out.println("Apellido");
		String lastName = in.nextLine();
		System.out.println("");
		System.out.println("Identificacion: ");
		int id = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("¿El vendedor ha realizado alguna venta?");
		System.out.println("(1) Si.");
		System.out.println("(2) No.");
		int answer = in.nextInt();
		in.nextLine();
		int totalSales;
		if(answer == 1) {
			System.out.println("¿Cuantas ventas ha realizado el vendedor?\n");
			System.out.println("R//");
			totalSales = in.nextInt();
			in.nextLine();
		} else {
			totalSales = 0;
		}
		return new SalesAdvisor(name, lastName, id, totalSales);
	}
	
	public Client plusClient() {
		Scanner in = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("------------Nuevo Cliente-----------");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("Escriba el nombre del cliente: ");
		String name = in.nextLine();
		System.out.println("");
		System.out.println("Escriba el apellido del cliente: ");
		String lastName = in.nextLine();
		System.out.println("");
		System.out.println("Escriba el numero de identificacion del cliente: ");
		int id = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("Escriba el numero de telefono: ");
		int telephoneNumber = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("Escriba el email: ");;
		String email = in.nextLine();
		System.out.println("");
		return new Client(name, lastName, id, telephoneNumber, email, email);		
	}
	
	public Vehicle plusVehicle() {
		Scanner in = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("-----------Nuevo Vehiculo-----------");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println("");
		int totalPriceOfSale = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("Ingrese el precio base: ");
		int basePrice = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("Ingrese la marca: ");
		String brand = in.nextLine();
		System.out.println("");
		System.out.println("Ingrese el modelo: ");
		String model = in.nextLine();
		System.out.println("");
		System.out.println("Ingrese el cilindraje: ");
		int displacement = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("Ingrese el kilometraje: ");
		int mileage = in.nextInt();
		in.nextLine();
		System.out.println("");
		System.out.println("Ingrese el tipo (usado o nuevo)");
		String type = in.nextLine();
		String placa;
		if(type.equalsIgnoreCase("usado")) {
			System.out.println("");
			System.out.println("Ingrese la placa: ");
			placa = in.nextLine();
		} else {
			placa = "None";
		}
		return new Vehicle(totalPriceOfSale, basePrice, brand, model, displacement, mileage, type, placa);
	} 
	
	public void doOperation(int answer) {
		switch (answer) {
			case NEW_CLIENT :
				plusSalesAdvisor();
				break;
			case NEW_SALES_ADVISOR : 
				plusClient();
				break;
			case NEW_VEHICLE :
				plusVehicle();
				break;
			case INFO_SALES_ADVISOR :
				System.out.println(concessionaire.getInfoSalesAdvisor());
				break;
			case INFO_CLIENT :
				System.out.println(concessionaire.getInfoClients());
				break;
			case INFO_VEHICLE :
				System.out.println(concessionaire.getInfoVehicles());
				break;
			case CALCULATE_PRICE :
			int totalPriceOfSale = 0;
			int basePrice = 0;
			String type = null;
			System.out.println(concessionaire.calculateTotalPriceOfSale(totalPriceOfSale, basePrice, type));
				break;
			case EXIT:
				break;
			default :
				System.out.println("Opcion invalida, repita nuevamente");
		}
	}

	/*Inicia el programa. <br>
	*<b>pre: name</b> <br>
	*<b>post: </b> Inicia el programa. <br>
	*@param
	*/
	public void startProgram() {
		int answer;
		do {
			showMenu();
			answer = readAnswer();
			doOperation(answer);
		} while(answer!=EXIT);
	}
}
