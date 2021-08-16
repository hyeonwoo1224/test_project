package test_project;

import java.util.Scanner;


import test_project_seohee.count_seohee;

import jajang_hyeonwoo.Jajang_hy;


public class Main_project {

	public static void main(String[] args) {
		Jajang_hy hy = new Jajang_hy();

		
		Scanner input = new Scanner(System.in);
		
		count_seohee cnt;
		cnt = new count_seohee();

		int num;
		while(true) {
		System.out.println("1.메뉴 및 수량 선택");
		System.out.println("2.소스 선택");
		System.out.println("3.맵기 선택");
		System.out.println("4.금액 확인");
		System.out.println(">>>>>>");



		num = input.nextInt();

		
		switch(num) {
		case 1 :
			System.out.println("1.짜장면 2.짬뽕 ");
			System.out.println(">>>>>>");

			num= input.nextInt();
			
			if(num==1) {
				System.out.println("1.짜장면 추가  2. 짜장면 취소");
				 int ja = input.nextInt();
				if(ja == 1) {
					cnt.jajangCntUp();
					System.out.println("짜장면 갯수: " + cnt.jajangCnt);
					System.out.println("짬뽕 갯수: " + cnt.jjamppongCnt);
				} else if(ja == 2 && cnt.jajangCnt>=0){
					cnt.jajangCntDown();
					System.out.println("짜장면 갯수: " + cnt.jajangCnt);
					System.out.println("짬뽕 갯수: " + cnt.jjamppongCnt);
				}
			}else {
				System.out.println("1. 짬뽕 추가  2. 짬뽕 취소");
				int jjam = input.nextInt();
				if(jjam == 1) {
					cnt.jjamppongCntUP();
					System.out.println("짬뽕 갯수: " + cnt.jjamppongCnt);
					System.out.println("짜장면 갯수: " + cnt.jajangCnt);
				} else if(jjam == 2 && cnt.jjamppongCnt>=0) {
					cnt.jjamppongCntDown();
					System.out.println("짬뽕 갯수: " + cnt.jjamppongCnt);
					System.out.println("짜장면 갯수: " + cnt.jajangCnt);
				} else {System.out.println("번호를 확인해주세요.");}
			}

			hy.jajanInput();


			break;



		case 2 : System.out.println("소스 양 선택");
			break;
			
			
		case 3 :
			System.out.println("1. 맵기정도 UP, 2. 맵기정도 Down");
			break;
			
		case 4 :
			System.out.println("주문을 확인합니다.");
			System.out.println("짜장면 : ");
			System.out.println("짬뽕 : ");
			System.out.println("총 금액 : ");
			break;
		
		default : 
			System.out.println("다시 선택하세요"); 
		}
	}
}
}