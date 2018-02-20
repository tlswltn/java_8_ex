package com.jisu.s1;

import java.util.Scanner;

public class StudentService {
	
	//학생 추가 메서드
	//메서드명 addStudent
	//학생인원수 입력
	//학생수만큼 
	//이름 입력
	//번호 입력
	//
		public Student [] addStudent() {
			Scanner sc = new Scanner(System.in);
			System.out.println("학생의 수를 입력");
			int num = sc.nextInt();
			Student [] students = new Student[num];
			
			for(int i=0; i<students.length;i++) {
				Student student = new Student();
				System.out.println("이름 입력");
				student.name=sc.next();
				System.out.println("번호 입력");
				student.num=sc.nextInt();
				students[i]=student;
				
				
				
			}
			
			return students;	
			
		}
}

//

				
		public void addPoint(Student [] students) {
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<students.length;i++) {
				System.out.println(students[i].name+"의 국어 점수 입력");
				students[i].kor=sc.nextInt();
				System.out.println(students[i].name+"의 영어 점수 입력");
				students[i].math=sc.nextInt();
				System.out.println(students[i].name+"의 수학 점수 입력");
				students[i].math=sc.nextInt();
				//total
				
}
