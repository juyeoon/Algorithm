import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N과 M으로 최대의 팀을 만든 다음
// 팀이 안 된 사람의 합을 K에서 뺀 후
// K<=0(인턴에 사람이 모자라지 않음)이 될 때까지 K에서 3을 빼고 팀 수에서 1을 빼는 걸 반복(팀에서 인턴으로 이동)한다
public class B2875_대회_or_인턴 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 여학생 수
		int M = Integer.parseInt(s[1]); // 남학생 수
		int K = Integer.parseInt(s[2]); // 필요한 인턴 수

		int team = Math.min(N / 2, M); // 여학생과 남학생으로 만들 수 있는 팀 최대의 수
		K -= (N - team * 2) + (M - team); // 팀이 안 된 사람의 합을 빼기
		while (K > 0) { // K<=이 될 때까지 반복
			team--; // 한 팀이 인턴으로
			K -= 3; // 필요한 인턴 수에서 3명빼기
		}
		System.out.println(team); // 최대로 만들 수 있는 팀의 수 출력
		br.close();
	}
}