package test_project_jungyooseok;

import java.util.Scanner;

public class spicy_junhyooseok {
    public int spicy;
    
    public void spicyUp() {
       ++spicy;
    }
    public void spicyDown() {
       --spicy;
    }
    public class spicy_junhyooseok01 {
    	public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
    	    spicy_junhyooseok t = new spicy_junhyooseok();
    	    
    	    System.out.println("==== �� ���� ====");
    		System.out.println("1.���� 2.����� 3.�ֹ� ���");
    		
    	    int ch;
    	    ch = input.nextInt();
    	    if(ch == 1) {
				t.spicyUp();
			}else if(ch == 2 && t.spicy>0)  {
				t.spicyDown();
			}
			System.out.println("현재맵기 단계 : "+t.spicy);
    
    	}
    }
}
