import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// H.indexOf(N, idx) => H 문자열의 idx 위치에서부터 N이 처음으로 등장하는 위치
// idx를 H.indexOf(N, idx)로 갱신하며 처음으로 나온 위치를 저장
// idx가 -1 아니면 아직 N이 등장할 수 있으므로 카운트, idx에는 1을 더해 다음 문자부터 확인할 수 있게 갱신
// idx가 -1이면 더 이상 없는 것이므로 반복문 종료. idx가 H의 길이를 넘어서도 종료
public class B12780_원피스 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String H = br.readLine(); // 전체 문자열
		String N = br.readLine(); // 찾을 문자열
		int cnt = 0; // 문자열 등장 횟수
		int idx = -1; // 인덱스
		while (idx != 0 && idx < H.length()) { // 더이상 없을 때까지
			idx = H.indexOf(N, idx); // idx 위치 뒤에서의 문자열의 위치
			if (idx != -1) { // 뒤에 있으면
				cnt++; // 카운트
			}
			idx++; // 위치 + 1
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}