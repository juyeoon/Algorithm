import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문자열의 문자를 반복문으로 확인
public class B8595_히든_넘버 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 임시로 연속된 숫자 문자열을 저장할 스트링빌더
		int N = Integer.parseInt(br.readLine()); // 문자열의 길이
		String s = br.readLine(); // 문자열
		long sum = 0; // 숫자 합
		for (int i = 0; i < N - 1; i++) { // 마지막에서 하나 앞까지(range of index)
			char c = s.charAt(i); // 확인할 문자(현재)
			if (c >= 48 && c <= 57) { // 현재 문자가 숫자면
				sb.append(c); // sb에 추가
				char cc = s.charAt(i + 1); // 확인할 문자 (바로 다음)
				if (!(cc >= 48 && cc <= 57)) { // 다음 문자가 숫자가 아니면
					sum += Integer.parseInt(sb.toString()); // sb를 int로 변환 후 sum에 더함
					sb.setLength(0); // sb 초기화
				}
			}
		}
		char c = s.charAt(N - 1); // 마지막 문자 확인
		if (c >= 48 && c <= 57) { // 마지막 문자가 숫자면
			sb.append(c); // sb에 추가
			sum += Integer.parseInt(sb.toString()); // sb를 int로 변환 후 sum에 더함
		}
		System.out.println(sum); // 출력
	}
}
