package paket;

public class Auto extends Vozilo {
	private int brojPutnika;
	
	public Auto() {
		
	}
	public Auto(int brojPutnika) {
		this.brojPutnika=brojPutnika;
	}
	
	public int getBrojPutnika() {
		return brojPutnika;
	}
	public void setBrojPutnika(int brojPutnika) {
		this.brojPutnika = brojPutnika;
	}

	public double NaplataPutarine(double CenaPutarine) {
		return CenaPutarine + (CenaPutarine * 0.1) * brojPutnika;
	}
	
}
