package model;
public class MechanicalCertificade {
	private double gasLevels;
	
	public MechanicalCertificade(double gasLevels) {
		this.gasLevels = gasLevels;
	}
	
	public double getGasLevels() {
		return gasLevels;
	}
	
	public void setGasLevels(double gasLevels) {
		this.gasLevels = gasLevels;
	}
	
	public void aleatoryGasLevels(double gasLevels) {
		double aleatotyGasLevel = Math.random()*100+1;
		gasLevels = aleatotyGasLevel;
		this.gasLevels = gasLevels;
	}
}
