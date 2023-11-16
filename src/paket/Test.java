package paket;

public class Test {

	public static void main(String[] args) {
		Avion avion1 = new Avion();
		avion1.setCenaPutarine(100);
		avion1.setKlasaAviona("Biznis klasa");
		System.out.println(avion1.NaplataPutarine(avion1.getCenaPutarine()));
		
		Auto auto1 = new Auto();
		auto1.setCenaPutarine(100);
		auto1.setBrojPutnika(5);
		System.out.println(auto1.NaplataPutarine(auto1.getCenaPutarine()));
		
		Motocikl motor1 = new Motocikl();
		motor1.setBrojVozaca(2);
		motor1.setCenaPutarine(100);
		System.out.println(motor1.NaplataPutarine(motor1.getCenaPutarine()));

	}

}
