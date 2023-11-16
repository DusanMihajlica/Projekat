package paket;

public abstract class Vozilo {
	protected double CenaPutarine;
	public abstract double NaplataPutarine(double CenaPutarine);
	
	
	public Vozilo() {
		
	}
	public Vozilo(double CenaPutarine) {
		this.CenaPutarine=CenaPutarine;
	}

	public double getCenaPutarine() {
		return CenaPutarine;
	}

	public void setCenaPutarine(double cenaPutarine) {
		CenaPutarine = cenaPutarine;
	}
}
