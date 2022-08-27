package java_01;

public class Ex9 {

	public static void main(String[] args) {
		//두 변수 값 바꾸기
		
		int x=10,y=5;
		
		System.out.println("x"+x);
		System.out.println("y"+y);
		
		int tmp;//임시변수 빈컵 역할
		
		tmp=x;
		x=y;
		y=tmp;
		
		System.out.println("x"+x);
		System.out.println("y"+y);

	}

}
