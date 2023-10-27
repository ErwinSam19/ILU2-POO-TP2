package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if (controlPrendreEtal.verifierIdentite(nomVendeur)==false) {
			System.out.println("Je suis désolée"+ nomVendeur + " mais il faut être un Habitant pour pouvoir vendre");
		}
		else {
				System.out.println("Bonjour"+nomVendeur+ "je vais regarder si je peux vous trouver un étal !");
				if (controlPrendreEtal.resteEtals()==false) {
					System.out.println("Désolée "+ nomVendeur+ "il n'y a plus d'étal qui ne soit pas déja occupé");
			
				}
				else {
					StringBuilder question1= new StringBuilder();
					StringBuilder question2= new StringBuilder();
					
					System.out.println("Il me reste quelques étals pour vous");
					System.out.println("Il me faudrait quelques renseignements :");
					question1.append("Quelle produit souhaitiez vous vendre ?");
					String produit = scan.nextLine();
					question2.append("Combien souhaitez vous en vendre ?");
					int nbProduit =Clavier.entrerEntier(question2.toString());
					int numeroEtal =controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
					if (numeroEtal!=1) {
						System.out.println("Le vendeur "+ nomVendeur+ "s'est installé à l'étal n"+ numeroEtal);
				}
				}
				
		
			
		}
		
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
