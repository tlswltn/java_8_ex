package com.jisu.s2;

public class Shef_Source {
	
	public Food_Source makeSource(int select) {
		Food_Source source=null;
		switch(select) {
		case 1:
			source= new Food_Source();
			source.oilName="Olive";
			source.spiceName="Hub";
			break;
		case 2:
			source = new Food_Source();
			source.oilName="Milk";
			source.spiceName="Cheese";
			break;
		default:
			
		}
		
		/*Food_Source source = new Food_Source();
		source.oilName="Olive";
		source.spiceName="Hub";*/
		
		//oilName ="Milk"
		//spiceName = "Cheese";		
		
		return source;
	}

}
