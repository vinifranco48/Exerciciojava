package Entities;

public class Indivual extends Pessoa {
  private Double heathExpenditures;
  public Indivual() {
		super();
	}

	public Indivual(String name, Double anualIncome, Double heathExpenditures) {
	super(name, anualIncome);
	this.heathExpenditures = heathExpenditures;
}

	public Double getHeathExpenditures() {
		return heathExpenditures;
	}

	public void setHeathExpenditures(Double heathExpenditures) {
		this.heathExpenditures = heathExpenditures;
	}

	@Override
	public double tax() {
		
		if(getAnualIncome() < 20000.0) {
			return (getAnualIncome() * 0.15) - (heathExpenditures * 0.5);
		}
		else {
			return (getAnualIncome() * 0.25) - (heathExpenditures * 0.5);
		}

}
}
	