// 연산자 실습문제 1
package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수: ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수: ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수: " + candy / people);
		System.out.println("남는 사탕 개수: " + candy % people);
			
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("학년(정수만): ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만): ");
		int classRoom = sc.nextInt();
		
		System.out.print("번호(정수만): ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생): ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지): ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f 점 입니다.",
				grade, classRoom, number, name, gender, score);
		
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: " );
		int kor = sc.nextInt();
		
		System.out.print("영어: " );
		int eng = sc.nextInt();
		
		System.out.print("수학: " );
		int math = sc.nextInt();

		int sum = kor + eng + math; // 합계
		double avg = sum / 3;//평균
		
		System.out.println("합계: " + sum);
		System.out.printf("평균: %.1f ", avg);
						
	}

}
