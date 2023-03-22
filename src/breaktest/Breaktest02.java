package breaktest;

public class Breaktest02 {

	public static void main(String[] args) {
			int i=0;
			for ( ; ; ) {					// for문에 조건식을 넣지 않으면 무한루프가 됨
				System.out.println("Hi");	
				i += 1;
				if (i>3) break;				// 3보다 커지면 멈춰라. 0,1,2,3 ->4번출력
			}
	}
}
