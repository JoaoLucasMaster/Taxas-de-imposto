package model;

public class Iss implements Tax{
	
	@Override
	public double calculateTax(double value)
	{
		return 10;
	}
}
