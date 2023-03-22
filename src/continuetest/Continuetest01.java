package continuetest;

public class Continuetest01 {
	public static void main(String[] args) {
		int i=0;
		for(i=1 ; i<=10  ; i++ ){
			if(  i % 4  == 0 ){
				continue;			//4의 배수일 때마다 숫자를 넘어 뛰어라.
			}
			System.out.println(i);	//1,2,3,5,6,7,9,10
		}
		System.out.println("작업종료");
		System.out.println(i);		//for를 탈출해서 11
	}
}
