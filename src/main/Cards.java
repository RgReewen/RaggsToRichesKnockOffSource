package main;

import java.util.Random;

public class Cards {
	// this class generates how many of each card you get
	int commons_m, rares_m, veryRares_m, misfortunes_m = 0;
	Random random = new Random();

	// default constuctor
	public Cards() {

	}

	// useless constructor because I am dumb
	public Cards(int commons, int rares, int veryRares, int misfortunes) {

	}

	public int getCommons() {
		return commons_m;
	}

	public int getRares() {
		return rares_m;
	}

	public int getVeryRares() {
		return veryRares_m;
	}

	public int getMisfortunes() {
		return misfortunes_m;
	}

	public void generateCards() {
		for (int i = 0; i < 5; i++) {
			// generating a number between 1 and 100 so we can have a bias for certain cards
			// (so it's more likely that we get a common card etc)
			int rand = random.nextInt(100) + 1;
			if (rand <= 60) {
				if (commons_m > 2) // so you can draw a maximum of 3 commons
					i--;
				else
					commons_m++;
			} else if (rand > 60 && rand <= 85) {
				if(rares_m > 1)
					i--;
				else
					rares_m++;
			}
			else if (rand > 85 && rand <= 95) {
				if(veryRares_m > 1)
					i--;
				else
					veryRares_m++;
			}
			else {
				if(misfortunes_m > 1)
					i--;
				else
					misfortunes_m++;
			}
		}
		//System.out.println("Common Cards: " + commons_m + " Rare Cards: " + rares_m + " Very Rare Cards: " + veryRares_m + " Misfortune Cards: " + misfortunes_m);
	}

	public String toString() {
		String text = "Common Cards: " + commons_m + " Rare Cards: " + rares_m + " Very Rare Cards: " + veryRares_m + " Misfortune Cards: " + misfortunes_m;
		return text;
	}

}
