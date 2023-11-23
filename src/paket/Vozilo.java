package paket;

public abstract class Vozilo {
	protected double cenaPutarine;
	public abstract double naplataPutarine();
	
	public Vozilo() {
		
	}
	public Vozilo(double cenaPutarine) {
		this.cenaPutarine=cenaPutarine;
	}

	public double getCenaPutarine() {
		return cenaPutarine;
	}

	public void setCenaPutarine(double cenaPutarine) {
		this.cenaPutarine = cenaPutarine;
	}
}
