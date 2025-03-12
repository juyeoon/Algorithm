import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복문을 돌면서 입력 문자열에 "anj"가 있는지 확인 
// boolean 변수로 존재 여부 저장
// boolean 변수 값에 따라 다르게 출력
public class B17350_2루수_이름이_뭐야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 야구팀 멤버 수
		boolean anj = false; // "anj" 존재 여부
		for (int i = 0; i < N; i++) {
			if (br.readLine().equals("anj")) { // "anj"가 있으면
				anj = true;
				break; // 반복문 탈출
			}
		}
		System.out.println(anj ? "뭐야;" : "뭐야?"); // 출력
		br.close();
	}
}