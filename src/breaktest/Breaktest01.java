package breaktest;

class Breaktest {
	public static void main(String[] args) {
		int i=0;
		for(i=1 ; i<=10  ; i++ ){
			if(  i % 4  == 0 ) break;	// 4의 배수가 나오면 멈추고 for문 탈출해.
			System.out.println(i);		// 1,2,3
		}
		System.out.println("작업종료");
		System.out.println(i);			// 4
	}
}
