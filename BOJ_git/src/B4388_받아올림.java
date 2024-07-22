import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// `carry` 변수를 이용하여 계산기 구현
// 현재 값의 1의자리 값의 합과 carry의 합이 10이상이면 carry 발생
// 계산 후 1의 자리 수 삭제
// 반복
public class B4388_받아올림 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // EOI
			st = new StringTokenizer(s);
			int A = Integer.parseInt(st.nextToken()); // 첫번째 수
			int B = Integer.parseInt(st.nextToken()); // 두번째 수
			int cnt = 0; // 받아올림 횟수
			int carry = 0; // 받아올림 값
			while (A != 0 || B != 0) { // 길이가 더 짧은 값의 길이만큼 반복
				if (A % 10 + B % 10 + carry > 9) { // 현재 자리수의 값의 합과 carry의 합이 한 자리 수를 넘으면
					cnt++; // 카운트
					carry = 1; // carry 저장
				} else { // 한자리 수면
					carry = 0; // carry 초기화
				}
				A /= 10; // 현재 자리 수 제외시키기
				B /= 10; // 현재 자리 수 제외시키기
			}
			sb.append(cnt).append("\n"); // 출력값 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
