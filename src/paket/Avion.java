package paket;

public class Avion extends Vozilo {
	
	private String klasaAviona;
	
	public Avion() {
		
	}
	public Avion(String klasaAviona){
		this.klasaAviona = klasaAviona;
	}
	
	public String getKlasaAviona() {
		return klasaAviona;
	}
	public void setKlasaAviona(String klasaAviona) {
		this.klasaAviona = klasaAviona;
	}
	
	public double naplataPutarine() {
		if(klasaAviona=="Ekonomska klasa")
			return cenaPutarine - cenaPutarine * 0.15;
		else if(klasaAviona=="Biznis klasa")
			return cenaPutarine + cenaPutarine * 0.25;
		else 
			return cenaPutarine;
	}

}
