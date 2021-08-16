package test_project;

public class Main_project {

	public static void main(String[] args) {

		int num;
		while(true) {
		System.out.println("1.메뉴 선택");
		System.out.println("2.소스 선택");
		System.out.println("3.맵기 선택");
		System.out.println("4.금액 확인");
		System.out.println(">>>>>>");

		
		switch(num) {
		case 1 :
			System.out.println("1.짜장면 2.짬뽕 ");
			System.out.println(">>>>>>");

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