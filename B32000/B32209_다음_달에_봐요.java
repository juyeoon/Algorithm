import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32209
// 문제 포럼에 등록된 문제 수를 누적하면서 각 이벤트(1: 문제 추가, 2: 문제 사용)를 처리
// 문제를 사용하려고 할 때 현재 등록된 문제 수보다 많은 경우 해산(Adios)을 출력
// 모든 이벤트가 정상적으로 처리되면 "See you next month"를 출력
public class B32209_다음_달에_봐요 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Q = Integer.parseInt(br.readLine()); // 이벤트 개수
		int event = 0; // 문제 포럼에 현재 등록된 문제 수
		String ans = "See you next month"; // 출력 메시지
		for (int i = 0; i < Q; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int type = Integer.parseInt(st.nextToken()); // 이벤트 유형
			int num = Integer.parseInt(st.nextToken()); // 해당 이벤트에서의 문제 수
			if (type == 1) {
				event += num; // 문제 포럼에 문제 추가
			} else if (type == 2) {
				if (event < num) { // 사용하려는 문제 수가 현재 등록된 문제보다 많다면
					ans = "Adios"; // 해산 선언
					break; // 이벤트 처리 중단
				}
				event -= num; // 문제 사용 처리
			}
		}
		System.out.println(ans); // 출력
	}
}
