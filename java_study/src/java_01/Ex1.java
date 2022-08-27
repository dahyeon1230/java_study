package java_01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// Hello world 출력
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello wold");
		bw.close();


	}

}
