package test_project_seohee;

public class count_seohee {


	public int jajangCnt = 0;
	public int jjamppongCnt = 0;
	public int jajang =0, jjamppon=0,sum;
	
	public void jajangCntUp() {
		jajangCnt++;
		jajang+= 4000;
		sum = jajang+ jjamppon;
	}
	public void jajangCntDown() {
		jajangCnt--;
		jajang-= 4000;
		sum = jajang+ jjamppon;
	}
	public void jjamppongCntUP() {
		jjamppongCnt++;
		jjamppon+=6000;
		sum = jajang+jjamppon;
	}
	public void jjamppongCntDown() {
		jjamppongCnt--;
		jjamppon-=6000;
		sum = jajang+jjamppon;
	}
}
