import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 세 자리씩 끊어서 8진수로 만들기
// 맨 앞의 0은 생략되기 때문에 입력의 길이가 3의 배수가 아니면 3으로 나누고 남은 나머지 개수 만큼 먼저 계산하기
public class B1373_2진수_8진수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 입력 2진수
		int leng = s.length(); // 입력 2진수 길이
		if (leng % 3 == 1) { // 앞에 0이 두 개 생략 됐을 때
			sb.append(s.charAt(0));
		} else if (leng % 3 == 2) { // 앞에 0이 한 개 생략 됐을 때
			sb.append(((s.charAt(0) - '0') * 2 + (s.charAt(1) - '0')));
		}
		int idx = leng % 3; // 먼저 계산한 개수(3으로 나눈 나머지와 같음)만큼 뛰어넘기
		while (idx < leng) { // 3개씩 끊어서 계산하기
			int tmp = (s.charAt(idx) - 48) * 4 + (s.charAt(idx + 1) - 48) * 2 + (s.charAt(idx + 2) - 48); // 8진수로 변환
			sb.append(tmp);
			idx += 3; // 3개 뛰어넘기
		}
		System.out.println(sb); // 출력
		br.close();
	}
}