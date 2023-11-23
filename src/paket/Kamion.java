package paket;

public class Kamion extends Vozilo {

	private double nosivost;
	
	public double naplataPutarine()
			 {
		if(nosivost<1000)
			return cenaPutarine;
		else
		return cenaPutarine + (cenaPutarine*0.05*Math.floor(nosivost/1000));
	}

	public double getNosivost() {
		return nosivost;
	}

	public void setNosivost(double nosivost) {
		this.nosivost = nosivost;
	}

}
