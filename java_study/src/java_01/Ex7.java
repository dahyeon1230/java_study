package java_01;

public class Ex7 {

	public static void main(String[] args) {
		// 변수의 자료형
		int x=100; 	//정수를 저장할 변수의 타입은 int로 한다
		double pi=3.14; //실수를 저장할 변수의 타입은 double로 한다.
		char ch='a'; //문자1개를 저장할 변수의 타입은 cher
		String str="abc";//여러개의 문자를 저장할 타입은 String
		
		System.out.println(x);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		
		//변수의 타입
		//1bit=8bit
		//기본자료형: 메모리를 일정 크기 확보 후 사용하는 자료형
		//숫자형 - 정수형: byte(1byte) short(2byte) int(4byte) long(8byte)
		//	   - 실수형: float(4byte) 소수점 7자리까지 표현
		//			:double(8byte) 소수점 16자리까지 표현
		//논리형: boolean(1bit):true(참),false(거짓)을 표현하는 용도
		//참조형:
		//String: 문자열객체(문자 여러개 나열해서 표현가능)
		
		byte bs1=-128;
		//byte bs2=128; 수의 범위를 벗어나면 오류가 생긴다.
		//int num1=12345678900;
		long num=12345678900L;
		long big=100_000_000_00L;
		char myshar=65;
		float fNum=3.14f;
		
		System.out.println(bs1);
		System.out.println(num);
		System.out.println(big);
		System.out.println(myshar); //char형은  정수형에 속하므로 정수 호환임
		System.out.println(fNum);
	}

}
