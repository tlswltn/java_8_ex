package com.jisu.s2;

import java.util.Scanner;

public class Menu {
	
	
	public void order() {
		Scanner sc = new Scanner(System.in);
		Shef_Steak ss = new Shef_Steak();
		Shef_Pasta sp = new Shef_Pasta();
		Bill bill = new Bill();
		
		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.알리오올리오파스타");
		
		int select = sc.nextInt();
		Food_Steak fs=null;
		Food_Pasta fp=null;
		if(select<4) {
			fs = ss.makeSteak(select);
			bill.billSteak(fs);
		System.out.println(fs.name);
		System.out.println(fs.price);
	}else {
		fp = sp.makePasta(select-3);
		bill.billPasta(fp);
		

		
	
	}
}
}

