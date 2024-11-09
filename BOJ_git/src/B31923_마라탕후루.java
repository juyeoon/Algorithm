import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 반복문으로 10000번 돌리고 한 번 할 때마다 딸기와 샤인머스캣 개수를 늘려서 같으면 반복문 탈출
// 10000번 했는데도 개수가 같지 않으면 불가능 판단
// 불가능 하면 NO, 가능하면 꼬치마다의 꽂은 행동 횟수 출력
public class B31923_마라탕후루 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 탕후루 꼬치 개수
		int P = Integer.parseInt(st.nextToken()); // 로봇이 1분마다 꽂는 딸기의 개수
		int Q = Integer.parseInt(st.nextToken()); // 샤인머스캣의 개수
		StringTokenizer stA = new StringTokenizer(br.readLine()); // 꽂혀있는 딸기 개수
		StringTokenizer stB = new StringTokenizer(br.readLine()); // 꽂혀있는 샤인머스캣 개수
		boolean possible = true; // 꼬치마다 딸기와 샤인머스캣의 개수를 똑같이 만들 수 있는지 여부 (true: 만들 수 있음)
		for (int i = 0; i < N; i++) { // 꼬치 개수만큼 반복
			int A = Integer.parseInt(stA.nextToken()); // 현재 꼬치에 꽂혀있는 딸기 개수
			int B = Integer.parseInt(stB.nextToken()); // 현재 꼬치에 꽂혀있는 샤인머스캣 개수
			int cnt = 0; // 로봇이 꽂는 행동을 몇 번 했는지
			while (cnt < 10001) { // 10000번 이내만 가능
				if (A == B) { // 딸기와 샤인머스캣 개수가 같아지면
					sb.append(cnt).append(" "); // 몇 번 꽂았는지 출력
					break;
				}
				// 개수가 같지 않을 때
				A += P; // 딸기 꽂기
				B += Q; // 샤인머스캣 꽂기
				cnt++; // 카운트 증가
			}
			if (cnt == 10001) { // 10000번 했는데도 개수가 같지 않으면
				possible = false; // 불가능
				break; // 뒤에 더 할 필요 없음
			}
		}
		if (possible) { // 가능하면
			System.out.println("YES");
			System.out.println(sb);
		} else { // 불가능하면
			System.out.println("NO");
		}
		br.close();
	}
}