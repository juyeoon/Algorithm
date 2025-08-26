// https://www.acmicpc.net/problem/34161
// 정답은 "고래는 알을 낳을 수 없다"인데 정수가 아니므로 모든 튜플에 대해서 -1을 출력
public class B34161_OO0OO {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) { // 튜플 개수만큼 반복
			sb.append("-1\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
	}
}
