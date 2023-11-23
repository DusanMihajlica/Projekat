package paket;

public class Autobus extends Vozilo {
	private int BrojPutnika;

	public int getBrojPutnika() {
		return BrojPutnika;
	}

	public void setBrojPutnika(int brojPutnika) {
		BrojPutnika = brojPutnika;
	}

	public Autobus(int brojPutnika) {
		BrojPutnika = brojPutnika;
	}


	public double naplataPutarine() {

		return cenaPutarine;
	}



}
