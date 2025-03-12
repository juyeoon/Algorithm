import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 0번째 문자부터 복호문에 추가 후 
// 해당 문자가 'A'면 하나 뒤, 'B'면 두개 뒤, ... 로 이동하여 해당 문자를 복호문에 추가하는 것을 반복 (암호문의 마지막 문자 앞 문자까지)
// 마지막 문자 복호문에 추가 후 출력
public class B24196_Gömda_ord {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 암호문
		int end = s.length() - 1; // 암호문의 마지막 문자 인덱스
		int jmp = 0; // 뛰어넘을 길이
		for (int i = 0; i < end; i++) {
			sb.append(s.charAt(i)); // 복호문에 추가
			jmp = s.charAt(i) - 'A'; // 뛰어넘을 길이 계산
			i += jmp; // 뛰어넘기
		}
		sb.append(s.charAt(end)); // 마지막 문자 추가
		System.out.println(sb); // 출력
		br.close();
	}
}