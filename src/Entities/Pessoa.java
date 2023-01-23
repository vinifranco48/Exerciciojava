package Entities;

public abstract class Pessoa {
	private String name;
	private Double anualIncome;

	public Pessoa() {

	}

	public Pessoa(String name, Double anualIncome) {
		
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double tax();
}
