package test_project_nayujin;

public class calc_yujin {
	class pcal {//부모
		
		int jajang=4500, jjamppong=6000;
		
		
		public pcal(int jajang,int jjamppong) {
			this.jajang = jajang;
			this.jjamppong = jjamppong;
			
		}

	}	

	class subcal extends pcal{//자식
		int sum;
		
		public subcal(int jajang, int jjamppong, int sum) {
			super(jajang, jjamppong);
			this.sum = sum;
		}
		
	public void cal() {
		this.sum = this.jajang +this.jjamppong;
	}

	public void total() {
		this.cal();
		System.out.println("선택한 메뉴의 총 금액은 : " +this.sum);
	}

	}

}
