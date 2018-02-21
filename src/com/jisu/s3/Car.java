package com.jisu.s3;

public class Car {
	
	String color;
	String brand;
	int cc;
	
	public Car () {
		//default , 기본, 빈, 생성자
		//습관적으로 만들어ㅇ놔야함 ! ! !
		this("red");//자신의 또다른 생성자를 호출 
		
	}

	public Car(String color) {
		this(color,"Audi"); //this(자신을 나타내는 객체) 는 객체 안에서만 사용 가능
		
		brand="Audi";
		cc=3000;
	}
		public Car(String color, String brand) {
			this(color,brand,3000);
		
	}
		
		public Car (String color, String brand, int cc) {
			this.color=color;
			this.brand=brand;
			this.cc=cc;

			
		}
	public void info() {
		System.out.println("Color : "+color);
		System.out.println("Brand : "+brand);
		System.out.println("Cc : "+cc);
		this.make();
	}
		public void make() {
			System.out.println("자동차 제작 완료");
			
		}
		
	}

