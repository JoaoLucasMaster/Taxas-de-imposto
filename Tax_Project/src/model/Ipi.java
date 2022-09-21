package model;

public class Ipi implements Tax{
	double shipping;
	double insurance;
	double productValue;
	
	public Ipi(double shipping,double insurance)
	{
		this.shipping = shipping;
		this.insurance = insurance;
	}
	
	public double getShipping() {
		return shipping;
	}

	public void setShipping(double shipping) {
		this.shipping = shipping;
	}

	public double getInsurance() {
		return insurance;
	}

	public void setInsurance(double ensurance) {
		this.insurance = ensurance;
	}

	@Override
	public double calculateTax(double value)
	{
		double calculationBasis = this.insurance+this.shipping;
		return productValue = (value+calculationBasis)*0.015;
	}
	
	public String formatedeData()
	{
		return "Valor final do produto(Com taxa IPI):" + this.productValue;
	}
}
