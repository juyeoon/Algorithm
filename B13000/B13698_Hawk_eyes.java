import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 컵 배열 상태 배열을 사용하여 초기 상태를 저장 후 임시 변수를 사용하는 스왑 방법으로 스왑 후 공 위치 출력
public class B13698_Hawk_eyes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine(); // 컵을 섞는 순서
		int cnt = s.length(); // 컵을 섞는 횟수
		int cup[] = new int[4]; // 컵 상태
		cup[0] = 1; // 작은 공
		cup[3] = 2; // 큰 공
		int tmp = 0; // 스왑할 때 쓰는 임시 변수
		for (int i = 0; i < cnt; i++) {
			char c = s.charAt(i); // 섞는 방법 
			if (c == 'A') { // 1,2 스왑
				tmp = cup[0];
				cup[0] = cup[1];
				cup[1] = tmp;
			} else if (c == 'B') { // 1,3 스왑
				tmp = cup[0];
				cup[0] = cup[2];
				cup[2] = tmp;
			} else if (c == 'C') { // 1,4 스왑
				tmp = cup[0];
				cup[0] = cup[3];
				cup[3] = tmp;
			} else if (c == 'D') { // 2,3 스왑
				tmp = cup[1];
				cup[1] = cup[2];
				cup[2] = tmp;
			} else if (c == 'E') { // 2,4 스왑
				tmp = cup[1];
				cup[1] = cup[3];
				cup[3] = tmp;
			} else { // 3,4 스왑
				tmp = cup[2];
				cup[2] = cup[3];
				cup[3] = tmp;
			}
		}
		sb.append("\n"); // 출력에 개행 삽입
		for (int i = 0; i < 4; i++) { // 컵 배열 순회
			if (cup[i] == 1) { // 작은 공이면
				sb.insert(0, i + 1); // 출력 맨 앞에 삽입
			} else if (cup[i] == 2) { // 큰 공이면
				sb.append(i + 1); // 출력 맨 뒤에 삽입
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}