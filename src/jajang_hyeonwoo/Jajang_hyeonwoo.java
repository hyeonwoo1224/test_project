package jajang_hyeonwoo;

import java.util.Scanner;

public class Jajang_hyeonwoo {
	public int jajang = 0;
	
	public void jajanInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("==== 양 설정 ====");
		System.out.println("1.보통 2.곱배기 3.주문 취소");
		int n1;
		n1 = input.nextInt();
		if(n1 == 1) jajangPlus();
		else if(n1 == 2) jajangPlus();
		else System.out.println("주문취소");
		
		}
	private void jajangPlus() {
		jajang++;
		System.out.println("짜장1증가");
	}
}
