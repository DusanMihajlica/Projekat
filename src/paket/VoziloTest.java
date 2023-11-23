package paket;

import static org.junit.Assert.*;

import org.junit.Test;

public class VoziloTest {
																
	@Test
	public void testNaplatePutarineBicikla() {
		Bicikl bicikl1 = new Bicikl(100);
		assertEquals(0.0,bicikl1.naplataPutarine(), 0.0);
	}
	@Test
	public void testNaplatePutarineZaKamion1000kg() {
		Kamion kamion1 = new Kamion();
		kamion1.setCenaPutarine(100);
		kamion1.setNosivost(1000);
		assertEquals(105.0,kamion1.naplataPutarine(), 0.0);
	}
	@Test
	public void testNaplatePutarineZaKamion2000kg() {
		Kamion kamion1 = new Kamion();
		kamion1.setCenaPutarine(100);
		kamion1.setNosivost(2000);
		assertEquals(110.0,kamion1.naplataPutarine(), 0.0);
	}
	@Test
	public void testNaplatePutarineZaKamion3000kg() {
		Kamion kamion1 = new Kamion();
		kamion1.setCenaPutarine(100);
		kamion1.setNosivost(3000);
		assertEquals(115.0,kamion1.naplataPutarine(), 0.0);
	}
	@Test
	public void testNaplatePutarineZaAutobus() {
		Autobus autobus1 = new Autobus(3);
		autobus1.setCenaPutarine(100);
		assertEquals(100.0,autobus1.naplataPutarine(), 0.0);
	}
	

}
