import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 크로아티아 알파벳이 포함되어있는지 확인 
// 배열 범위에 주의
public class B2941_크로아티아_알파벳 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 단어
		int leng = s.length(); // 단어 길이
		int cnt = 0; // 크로아티아 알파벳 수
		for (int i = 0; i < leng; i++) { // 단어 길이만큼 반복
			char c = s.charAt(i); // 현재 문자
			if (i < leng - 1) { // 인덱스가 leng-1 밑일 때(charAt 범위 때문에)
				if (c == 'c') { // c=, c-
					if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
						i++; // 문자 2개라서 i 하나 증가
					}
				} else if (c == 'd') {
					if (s.charAt(i + 1) == 'z') { // dz=
						if (i < leng - 2 && s.charAt(i + 2) == '=') { // i+2 위치 문자 확인하기 위해 범위 다시 체크
							i += 2; // 문자 3개라서 i 2개 증가
						}
					} else if (s.charAt(i + 1) == '-') { // d-
						i++; // 문자 2개라서 i 하나 증가
					}
				} else if (c == 'l' || c == 'n') { // lj, nj
					if (s.charAt(i + 1) == 'j') {
						i++; // 문자 2개라서 i 하나 증가
					}
				} else if (c == 's' || c == 'z') { // s=, z=
					if (s.charAt(i + 1) == '=') {
						i++; // 문자 2개라서 i 하나 증가
					}
				}
			}
			cnt++; // 알파벳 개수 하나 증가
		}
		System.out.println(cnt); // 크로아티아 알파벳 수 출력
		br.close();
	}
}
