package test_project;

import java.util.Scanner;

import jajang_hyeonwoo.Jajang_hyeonwoo;

public class Main_project {

	public static void main(String[] args) {
		Jajang_hyeonwoo hy = new Jajang_hyeonwoo();

		Scanner input = new Scanner(System.in);
		
		int num;
		while(true) {
		System.out.println("1.�޴� ����");
		System.out.println("2.�ҽ� ����");
		System.out.println("3.�ʱ� ����");
		System.out.println("4.�ݾ� Ȯ��");
		System.out.println(">>>>>>");



		num = input.nextInt();

		
		switch(num) {
		case 1 :
			System.out.println("1.¥��� 2.«�� ");
			System.out.println(">>>>>>");
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