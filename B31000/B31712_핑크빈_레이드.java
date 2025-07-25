import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31712
// 0초부터 1초씩 증가시키며 세 마스코트의 스킬 타이밍인지 확인하고 대미지를 누적한 뒤 핑크빈의 체력에서 차감
// 핑크빈의 체력이 0 이하가 되는 최초의 시간을 출력
public class B31712_핑크빈_레이드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cU = Integer.parseInt(st.nextToken()); // 윤이의 스킬 주기
		int dU = Integer.parseInt(st.nextToken()); // 윤이의 대미지
		st = new StringTokenizer(br.readLine());
		int cD = Integer.parseInt(st.nextToken()); // 달구의 스킬 주기
		int dD = Integer.parseInt(st.nextToken()); // 달구의 대미지
		st = new StringTokenizer(br.readLine());
		int cP = Integer.parseInt(st.nextToken()); // 포닉스의 스킬 주기
		int dP = Integer.parseInt(st.nextToken()); // 포닉스의 대미지
		int hp = Integer.parseInt(br.readLine()); // 핑크빈의 초기 체력
		int time = 0; // 경과 시간
		while (true) { // 체력이 0 이하가 될 때까지
			int damage = 0; // 이번 초에 들어갈 총 대미지 초기화
			if (time % cU == 0) { // 윤이의 공격 타이밍인지 확인
				damage += dU;
			}
			if (time % cD == 0) { // 달구의 공격 타이밍인지 확인
				damage += dD;
			}
			if (time % cP == 0) { // 포닉스의 공격 타이밍인지 확인
				damage += dP;
			}
			hp -= damage; // 총 대미지를 핑크빈 체력에서 차감
			if (hp <= 0) { // 체력이 0 이하가 되면 종료
				break;
			}
			time++; // 다음 초로 넘어감
		}
		System.out.println(time); // 출력
		br.close();
	}
}
