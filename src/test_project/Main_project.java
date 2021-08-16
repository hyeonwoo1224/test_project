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
		System.out.println("1.�޴� �� ���� ����");
		System.out.println("2.�ҽ� ����");
		System.out.println("3.�ʱ� ����");
		System.out.println("4.�ݾ� Ȯ��");
		System.out.println(">>>>>>");



		num = input.nextInt();

		
		switch(num) {
		case 1 :
			System.out.println("1.¥��� 2.«�� ");
			System.out.println(">>>>>>");
			num= input.nextInt();
			
			if(num==1) {
				System.out.println("1.¥��� �߰�  2. ¥��� ���");
				 int ja = input.nextInt();
				if(ja == 1) {
					cnt.jajangCntUp();
					System.out.println("¥��� ����: " + cnt.jajangCnt);
					System.out.println("«�� ����: " + cnt.jjamppongCnt);
				} else if(ja == 2 && cnt.jajangCnt>=0){
					cnt.jajangCntDown();
					System.out.println("¥��� ����: " + cnt.jajangCnt);
					System.out.println("«�� ����: " + cnt.jjamppongCnt);
				}
			}else {
				System.out.println("1. «�� �߰�  2. «�� ���");
				int jjam = input.nextInt();
				if(jjam == 1) {
					cnt.jjamppongCntUP();
					System.out.println("«�� ����: " + cnt.jjamppongCnt);
					System.out.println("¥��� ����: " + cnt.jajangCnt);
				} else if(jjam == 2 && cnt.jjamppongCnt>=0) {
					cnt.jjamppongCntDown();
					System.out.println("«�� ����: " + cnt.jjamppongCnt);
					System.out.println("¥��� ����: " + cnt.jajangCnt);
				} else {System.out.println("��ȣ�� Ȯ�����ּ���.");}
			}
			hy.jajanInput();

			break;



		case 2 : System.out.println("�ҽ� �� ����");
			break;
			
			
		case 3 :
			System.out.println("1. �ʱ����� UP, 2. �ʱ����� Down");
			break;
			
		case 4 :
			System.out.println("�ֹ��� Ȯ���մϴ�.");
			System.out.println("¥��� : ");
			System.out.println("«�� : ");
			System.out.println("�� �ݾ� : ");
			break;
		
		default : 
			System.out.println("�ٽ� �����ϼ���"); 
		}
	}
}
}