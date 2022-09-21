package model;

public class Icms implements Tax{
	private IcmsAliquot aliquot;
	
	
	@Override
	public double calculateTax(double value)
	{
		return value * aliquot.SPDF;
	}
}
