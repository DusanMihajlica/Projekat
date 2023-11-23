package paket;

public class Test {

	public static void main(String[] args) {
		Avion avion1 = new Avion();
		avion1.setCenaPutarine(100);
		avion1.setKlasaAviona("Biznis klasa");
		System.out.println(avion1.naplataPutarine());
		
		Auto auto1 = new Auto();
		auto1.setCenaPutarine(100);
		auto1.setBrojPutnika(5);
		System.out.println(auto1.naplataPutarine());
		
		Motocikl motor1 = new Motocikl();
		motor1.setBrojVozaca(2);
		motor1.setCenaPutarine(100);
		System.out.println(motor1.naplataPutarine());
		
		Kamion kamion1 = new Kamion();
		kamion1.setCenaPutarine(100);
		kamion1.setNosivost(5400);
		System.out.println(kamion1.naplataPutarine());
		
		Bicikl bicikl1 = new Bicikl(100);
		bicikl1.setCenaPutarine(100);
		bicikl1.setTip("planinski");
		System.out.println(bicikl1.naplataPutarine());
	}

}
