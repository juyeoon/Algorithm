import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// substring으로 5자리로 문자열을 자르고 비교 후 같으면 카운트
public class B31822_재수강 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String lecture = br.readLine().substring(0, 5); // 앞의 5자리만 저장
		int N = Integer.parseInt(br.readLine()); // 수강 신청 가능한 과목 수
		int cnt = 0; // 같은 문자열 개수
		for (int i = 0; i < N; i++) {
			if (lecture.equals(br.readLine().substring(0, 5))) { // 앞의 5자리가 같으면
				cnt++; // 카운트
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}