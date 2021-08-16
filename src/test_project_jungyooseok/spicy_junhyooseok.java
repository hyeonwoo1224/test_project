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
    Scanner input = new Scanner(System.in);
    
    int ch = input.nextInt()
	if(ch == 1) {
		t.intensityUp();
	}else if(ch == 2 && t.intensity>0)  {
		t.intensityDown();
	}
	System.out.println("���� ǳ�� : "+t.intensity);
}else {
	System.out.println("������ ���� Ű����");
    
}
