package com.spring.b.SetterInjection.collections;

public class Scores {
	private Double calculus;
	private Double physics;
	private Double chemistry;

	public Double getCalculus() {
		return calculus;
	}

	public void setCalculus(Double calculus) {
		this.calculus = calculus;
	}

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	public Double getChemistry() {
		return chemistry;
	}

	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}

	@Override
	public String toString() {
		return "Calculus: " + this.getCalculus() + " | " + 
				"Physics: " + this.getPhysics() + " | " + 
				"Chemistry: " + this.getChemistry();
	}
	
	

}
