package com.jisu.s2;

import java.util.Scanner;

public class Menu {
	
	
	public void order() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.알리오올리오파스타");
		
		int select = sc.nextInt();
		
		
		switch(select) {
			
	case 1:

		food_steak.name="안심스테이크";
		food_Steak.price=30000;
		food_steak.source= "Hub";
		
		break;
	case 2:
		food_steak.name="안심스테이크";
		food_Steak.price=50000;
		food_steak.source= "Hub";
		
		break;
	case 3:

		food_steak.name="안심스테이크";
		food_Steak.price=30000;
		food_steak.source= "Hub";
		
		break;
	case 4:

		food_steak.name="안심스테이크";
		food_Steak.price=30000;
		food_steak.source= "Hub";
		break;
	case 5:

		food_steak.name="안심스테이크";
		food_Steak.price=30000;
		food_steak.source= "Hub";
		break;
	case 6:

		food_steak.name="안심스테이크";
		food_Steak.price=30000;
		food_steak.source= "Hub";
		
		break;

		
	}

}
