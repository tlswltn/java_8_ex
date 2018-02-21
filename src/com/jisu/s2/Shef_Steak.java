package com.jisu.s2;

public class Shef_Steak {
	
public Food_Steak makeSteak(int select) {
		
		Food_Steak food_Steak = new Food_Steak();
		Shef_Source shef = new Shef_Source();
		
		switch(select) {
		case 1 :
			food_Steak.name="안심스테이크";
			food_Steak.price=30000;
			food_Steak.source=shef.makeSource(1);
			break;
		case 2 :
			food_Steak.name="등심스테이크";
			food_Steak.price=40000;
			food_Steak.source=shef.makeSource(2);
			break;
		case 3 :
			food_Steak.name="립스테이크";
			food_Steak.price=50000;
			food_Steak.source=shef.makeSource(1);
			break;
		default :
		}
		return food_Steak;
		
	}

}
