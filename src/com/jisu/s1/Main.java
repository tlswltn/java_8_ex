package com.jisu.s1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("program start");
		//객체:눈에 보이는 사물 또는 개념
		//학생 : 3명 , 1명당 object 
		Scanner sc = new Scanner(System.in);
		Student [] ar = new Student[2];
		Student student = new Student();
		ar[0]=student;
		ar[1]=new Student();
		ar[0].name=sc.next();
		
		for(int i=0; i<ar.length; i++) {
			student.name=sc.next();
			ar[i]=student;
			System.out.println(ar[1].name);

		}
		
		System.out.println("============");
		for(int i=0; i<ar.length; i++) {
			student = new Student();
			student.name=sc.next();
			ar[i]=student;
			System.out.println(ar[1].name);

		}
		


	}

}
