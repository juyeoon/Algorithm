import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한 변의 점 개수를 구한 후 제곱
// 한 변의 점 개수 : 초기(N:0) 2개에서 N까지 하나씩 증가할 때마다 (한 변의 점 개수 - 1)만큼 더하는 것을 반복 
public class B2903_중앙_이동_알고리즘 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 과정 횟수
		int oneSide = 2; // 한 변의 점 개수
		for (int i = 0; i < N; i++) { // N번 진행 한 후의 한 변의 점 개수 구하기
			oneSide += oneSide - 1; // (한 변의 점 개수 - 1)만큼 더하기
		}
		System.out.println(oneSide * oneSide); // 점의 총 개수 출력
		br.close();
	}
}