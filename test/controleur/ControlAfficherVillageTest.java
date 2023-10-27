package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;


class ControlAfficherVillageTest {
	private Village village;
	private Chef abraracourcix;
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation");
		village = new Village("le village des irréductibles",10,5);
		abraracourcix = new Chef ("Abracourcix", 10, village);
		village.setChef(abraracourcix);
	}
	@Test
	void testdonnerNomsVillageois() {
		ControlAfficherVillage controlaff = new ControlAfficherVillage(village);
		//TODO: a corriger
		// controlaff.ajouterGaulois("Bonémine", 10);
		for (int i =0 ;i< 2; i++) {
			
		}
	}

	@Test
	void testdonnerNomVillage() {
		ControlAfficherVillage controlaff = new ControlAfficherVillage(village);
		//TODO: a corriger		
	}
	
	@Test
	void testdonnerNbEtals() {
		ControlAfficherVillage controlaff = new ControlAfficherVillage(village);
	}

}
