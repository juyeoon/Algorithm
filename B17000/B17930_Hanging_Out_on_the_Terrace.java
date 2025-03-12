import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// enter 시 그룹의 인원수 + 현재 테라스 인원수가 제한을 넘는지 확인
// 넘으면 정답 + 1, 넘지 않으면 현재 테라스 인원수 갱신
// leave 시 현재 테라스 인원수 - 그룹 인원수
public class B17930_Hanging_Out_on_the_Terrace {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken()); // 인원수 제한
		int x = Integer.parseInt(st.nextToken()); // 이벤트 수
		int groupCnt = 0; // 테라스에 들어가지 못한 그룹의 수
		int nowPeople = 0; // 현재 테라스에 있는 인원수
		for (int i = 0; i < x; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken(); // enter or leave
			int p = Integer.parseInt(st.nextToken()); // 그룹의 인원수
			if (s.equals("enter")) { // enter
				if (nowPeople + p > L) { // 그룹의 인원수 + 현재 테라스 인원수가 제한을 넘으면
					groupCnt++; // 카운트
				} else { // 그 외
					nowPeople += p; // 현재 테라스 인원수에 그룹 인원수 더하기
				}
			} else { // leave
				nowPeople -= p; // 현재 테라스 인원수에서 그룹 인원수 빼기
			}
		}
		System.out.println(groupCnt); // 출력
		br.close();
	}
}
