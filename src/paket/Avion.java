package paket;

public class Avion extends Vozilo {
	
	private String KlasaAviona;
	
	public Avion() {
		
	}
	public Avion(String KlasaAviona){
		this.KlasaAviona = KlasaAviona;
	}
	
	public String getKlasaAviona() {
		return KlasaAviona;
	}
	public void setKlasaAviona(String klasaAviona) {
		KlasaAviona = klasaAviona;
	}
	
	public double NaplataPutarine(double CenaPutarine) {
		if(KlasaAviona=="Ekonomska klasa")
			return CenaPutarine - CenaPutarine * 0.15;
		else if(KlasaAviona=="Biznis klasa")
			return CenaPutarine + CenaPutarine * 0.25;
		else 
			return CenaPutarine;
	}

}
