package model;

public enum IcmsAliquot {
	SPRJ(0.12),
	SPDF(0.07),
	SPMG(0.15);
	
	private final double aliquot;
	
	private IcmsAliquot(double a)
	{
		this.aliquot = a;
	}
	
	public double getAliquot()
	{
		return this.aliquot;
	}
}
