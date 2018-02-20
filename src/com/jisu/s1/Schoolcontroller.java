package com.jisu.s1;

import java.util.Scanner;

public class Schoolcontroller {
	
	//메서드명은 start
	//리턴은 x
	//내용은
	//1.학생목록
	//2.성적입력
	//3.성적조회
	//4.전체조회
	//5.프로그램 종료
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentService sa= new StudentService();
		Studentview sv = new Studentview();
		Student [] students =null;		
		boolean check=true;
		
		while(check) {
			System.out.println("1.학생목록");
			System.out.println("2.성적입력");
			System.out.println("3.성적조회");
			System.out.println("4.전체조회");
			System.out.println("5.프로그램종료");
			
			
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				students=sa.addStudent();
			
				break;
			
			case 2 :
				ss.addPoint(Students);
				break;
				
			case 3 :
				sv.view(Students);
				break;
				
			case 4 : 
				break;
				

				}
		}
	

}
}
