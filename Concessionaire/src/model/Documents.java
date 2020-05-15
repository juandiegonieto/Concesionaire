package model;

public class Documents {
	private final int SOAT = 1;
	private final int MECHANICAL_CERTIFICADE = 1;
	private int price;
	private int year;
	private int[][] image;
	private Soat[] soat;
	private MechanicalCertificade[] mechanicalCertificade;
	
	public Documents(int price, int year, int[][] image) {
		this.price = price;
		this.year = year;
		image = new int[4][4];
		soat = new Soat[SOAT];
		mechanicalCertificade = new MechanicalCertificade[MECHANICAL_CERTIFICADE];
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getYear() {
		return year;
	}
	
	public int[][] getImage() {
		return image;
	}	
	
	public void setImage(int[][] image) {
		this.image = image;
	}
	
	public void aleatoryPrice(int price) {
		int aleatoryPrice = (int) Math.random()*(800000-5000000+1)+500000;
		price = aleatoryPrice;
		this.price = price;
	}
	
	public void aleatoryYear(int year) {
		int aleatoryYear = (int) Math.random()*(2020-1900+1)+1900;
		year = aleatoryYear;
		this.year = year;
	}
	
	public void addSoat(int coverageAmount) throws Exception {
		Soat newSoat = new Soat(coverageAmount);
		boolean added = false;
		for(int i = 0; i<SOAT; i++) {
			if(soat[i] == null) {
				soat[i] = newSoat;
				added = true;
			}
		}
		if(!added)
			throw new Exception("El soat no se ha podido agregar");
	}
	
	public void codeSoat(int[][] image) {
		image = new int[4][4];
		image[0][0] = 1;
		image[1][0] = 9;
		image[2][0] = 8;
		image[3][0] = 0;
		image[0][1] = 3;
		image[1][1] = 11;
		image[2][1] = 2;
		image[3][1] = 5;
		image[0][2] = 4;
		image[1][2] = 21;
		image[2][2] = 6;
		image[3][2] = 22;
		image[0][3] = 12;
		image[1][3] = 4;
		image[2][3] = 6;
		image[3][3] = 1;
		for (int x=0; x < image.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < image[x].length; y++) {
			    System.out.print (image[x][y]);
			    if (y!=image[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
		}
	}
	
	public void codeMechanicalCertificade(int[][]image) {
		
	}
	
	public void addMechanicalCertificade(int gasLevels) throws Exception {
		MechanicalCertificade newMechanicalCertificade = new MechanicalCertificade(gasLevels);
		boolean added = false;
		for(int i = 0; i<MECHANICAL_CERTIFICADE; i++) {
			if(mechanicalCertificade[i] == null) {
				mechanicalCertificade[i] = newMechanicalCertificade;
				added = true;
			}
		}
		if(!added)
			throw new Exception("El certificado de la revision tecnico-mechanica no se ha podido agregar");
	}
	
	public String basicInfo() {
		String info = "Precio: "+getPrice()+"\nAño: "+getYear();
		for(int i = 0; i<soat.length; i++) {
			if (soat[i] != null)
				info += "\nMonto de covertura del SOAT: "+soat[i].getCoverageAmount();
				info += "\nDecodificacion de la imagen: "+codeImage();
			else {
				info += "\nMonto de covertura del SOAT: No posee SOAT";
			}
		}
		for(int i=0; i<mechanicalCertificade.length; i++) {
			if (mechanicalCertificade[i] != null)
				info += "\nNiveles de gas de la revision tecnico-mecanica: "+mechanicalCertificade[i].getGasLevels();
			else {
				info += "\nNiveles de gas de la revision tecnico-mecanica: No posee certificado de revision tecnico-mecanica. ";
			}
		}
		return info;
	}
}
