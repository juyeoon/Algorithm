import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// KMP 알고리즘을 이용하여 문자열 포함 확인(시간 제한)
public class B16916_부분_문자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine(); // 전체 문자열
		String P = br.readLine(); // 찾을 문자열(pattern)
		boolean contain = false; // 포함 여부(true: 포함)
		int sLeng = S.length(); // 전체 문자열 길이
		int pLeng = P.length(); // 찾을 문자열 길이
		int table[] = new int[pLeng]; // 접두사와 접미사의 최대 길이 저장 배열
		int head = 0; // 앞부분 포인터
		for (int back = 1; back < pLeng; back++) { // table 채우기
			while (head > 0 && P.charAt(head) != P.charAt(back)) { // 불일치
				head = table[head - 1];
			}
			if (P.charAt(head) == P.charAt(back)) { // 일치
				table[back] = ++head;
			}
		}
		int cnt = 0; // 일치하는 문자열의 길이
		for (int i = 0; i < sLeng; i++) { // 문자열 포함 확인
			while (cnt > 0 && S.charAt(i) != P.charAt(cnt)) { // 불일치
				cnt = table[cnt - 1];
			}
			// 일치
			if (cnt == pLeng - 1) { // 문자열 찾음
				contain = true;
				break;
			} else { // 문자열 길이 갱신
				cnt++;
			}
		}
		System.out.println(contain ? 1 : 0); // 출력
		br.close();
	}
}