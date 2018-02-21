package com.jisu.s2;

public class Food_Main {

	public static void main(String[] args) {
		
		Shef_Pasta shef = new Shef_Pasta();
		
		Food_Pasta steak=shef.makePasta(2);
		
		System.out.println(steak.name);
		System.out.println(steak.price);
		System.out.println(steak.source.oilName);
		System.out.println(steak.source.spiceName);

/**/
		
	}
}
