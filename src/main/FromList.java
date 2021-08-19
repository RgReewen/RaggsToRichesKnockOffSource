package main;

import main.Cards;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

import javax.swing.JOptionPane;

import java.util.Random;

public class FromList {

	String[] commons_m = new String[3];
	String[] rares_m = new String[2];
	String veryRares_m;
	String misfortunes_m;
	String misfortunes2_m;

	public FromList() {

	}

	public void generateList() throws Exception {
		//sorry for the mess :(
		BufferedReader bufCommons = new BufferedReader(new FileReader(new File("Common.txt")));
		BufferedReader bufRares = new BufferedReader(new FileReader(new File("Rare.txt")));
		BufferedReader bufVeryRares = new BufferedReader(new FileReader(new File("Very_Rare.txt")));
		BufferedReader bufMisfortunes = new BufferedReader(new FileReader(new File("Misfortune.txt")));

		Vector<String> commonsList = new Vector<String>();
		Vector<String> raresList = new Vector<String>();
		Vector<String> veryRaresList = new Vector<String>();
		Vector<String> misfortunesList = new Vector<String>();

		int commonsAmount;
		int raresAmount;
		int veryRaresAmount;
		int misfortunesAmount;

		Random random = new Random();

		// reading the lists and saving each item to a position in a vector
		String strRead;
		while ((strRead = bufCommons.readLine()) != null) {
			commonsList.add(strRead);
		}
		bufCommons.close();
		while ((strRead = bufRares.readLine()) != null) {
			raresList.add(strRead);
		}
		bufRares.close();
		while ((strRead = bufVeryRares.readLine()) != null) {
			veryRaresList.add(strRead);
		}
		bufVeryRares.close();
		while ((strRead = bufMisfortunes.readLine()) != null) {
			misfortunesList.add(strRead);
		}
		bufMisfortunes.close();

		// generating how many of each card we get
		Cards Karten = new Cards();
		Karten.generateCards();
		commonsAmount = Karten.getCommons();
		raresAmount = Karten.getRares();
		veryRaresAmount = Karten.getVeryRares();
		misfortunesAmount = Karten.getMisfortunes();

		// System.out.println("Commons: " + commonsAmount + " Rares: " + raresAmount + "
		// Very Rares: " + veryRaresAmount + " Misfortunes Amount: " +
		// misfortunesAmount);

		// if the amount is above 0 for that certain card, a random number is generated
		// which is used to select a random item from the list
		// and saves it to a string or string array (depending on whether that type of
		// card can occure more than once per role)
		if (commonsAmount != 0) {
			for (int i = 0; i < commonsAmount; i++) {
				// System.out.println("Commons");
				int rand = random.nextInt(commonsList.size()) + 1;
				commons_m[i] = commonsList.elementAt(rand);
			}
		}

		if (raresAmount != 0) {
			for (int i = 0; i < raresAmount; i++) {
				// System.out.println("Rares");
				int rand = random.nextInt(raresList.size()) + 1;
				rares_m[i] = raresList.elementAt(rand);
			}
		}

		if (veryRaresAmount != 0) {
			int rand = random.nextInt(veryRaresList.size()) + 1;
			veryRares_m = veryRaresList.elementAt(rand);
		}

		if (misfortunesAmount != 0) {
			int rand = random.nextInt(misfortunesList.size()) + 1;
			misfortunes_m = misfortunesList.elementAt(rand);
		}

	}

	public String[] getCommons() {
		return commons_m;
	}

	public String[] getRares() {
		return rares_m;
	}

	public String getVeryRares() {
		return veryRares_m;
	}

	public String getMisfortunes() {
		return misfortunes_m;
	}

	public String getMisfortunes2() throws Exception {
		Vector<String> misfortunesList = new Vector<String>();
		BufferedReader bufMisfortunes = new BufferedReader(new FileReader(new File("Misfortune.txt")));
		String strRead;
		Random random = new Random();
		
		while ((strRead = bufMisfortunes.readLine()) != null) {
			misfortunesList.add(strRead);
		}
		bufMisfortunes.close();
		
		int rand = random.nextInt(misfortunesList.size()) + 1;
		misfortunes2_m = misfortunesList.elementAt(rand);
		
		return misfortunes2_m;
	}

}
