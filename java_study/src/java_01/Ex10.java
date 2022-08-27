package java_01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 키보드로 부터 입력값 받기
		
		//키보드르르 입력 받을 수 있는 스캐너 객체 준비
		Scanner scanner=new Scanner(System.in);//키보드 입력 파일 받거나
		
		System.out.println("첫 번째 정수를 입력하세요");
		int num= scanner.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요");
		int num2=scanner.nextInt();
		
		int num3=num+num2;
		System.out.println("두 정수의 합은"+num3);

	}

}
