package java_01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex2 {

	public static void main(String[] args)throws IOException {
		// Hello world 두번 반복해서 출력하기
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello world \n");
		bw.write("Hello world");
		
		bw.close();
	}

}
