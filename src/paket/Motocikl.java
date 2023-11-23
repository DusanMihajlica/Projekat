package paket;

public class Motocikl  extends Vozilo {
	
	private int BrojVozaca;
	
	
	public Motocikl() {
		
	}
	public Motocikl(int brojVozaca) {
		this.BrojVozaca=brojVozaca;
	}
	
	public int getBrojVozaca() {
		return BrojVozaca;
	}
	public void setBrojVozaca(int brojVozaca) {
		BrojVozaca = brojVozaca;
	}
	
	public double naplataPutarine() {
		if(this.getBrojVozaca()==1)
			return cenaPutarine - cenaPutarine * 0.2;
		else
			return cenaPutarine - cenaPutarine * 0.3;
	}

}
