package model;
public class Soat {
	
	private int coverageAmount;
	
	public Soat(int coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	
	public int getCoverageAmount() {
		return coverageAmount;
	}
	
	public void setCoverageAmount(int coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	
	public void aleatoyCoverageAmount(int coverageAmount) {
		int aleatoryCoverageAmount = (int) (Math.random()*10+1);
		coverageAmount = aleatoryCoverageAmount;
		this.coverageAmount = coverageAmount;
	}
}
