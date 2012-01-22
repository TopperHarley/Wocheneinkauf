package de.topley.data;

import java.util.ArrayList;
import java.util.List;

public class Rezept {
	private String name;
	
	public Rezept(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static List<Rezept> getRezepte() {
		List<Rezept> rezepte = new ArrayList<Rezept>();
		rezepte.add(new Rezept("Pfannkuchen"));
		rezepte.add(new Rezept("Bohnen mit Speck"));
		rezepte.add(new Rezept("Hackbraten"));
		rezepte.add(new Rezept("Nudelsalat"));
		return rezepte;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
