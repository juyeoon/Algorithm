import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/4884
// 조별 리그에서 토너먼트로 진출한 팀의 수 (qualify) = G * A + D
// 토너먼트 진행 팀 수 (tournament) = 2^(log2(qualify)의 올림)
// 토너먼트에 추가되는 팀 수 (additionCnt) = tournament - qualify
// 조별 리그 게임 수 = T * (T - 1) / 2 * G
// 토너먼트 게임 수 = tournament - 1
public class B4884_FIFA_월드컵 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("-1 -1 -1 -1")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			long G = Long.parseLong(st.nextToken()); // 그룹의 수
			long T = Long.parseLong(st.nextToken()); // 각 그룹의 팀 수
			long A = Long.parseLong(st.nextToken()); // 각 조에서 토너먼트로 진출하는 팀 수
			long D = Long.parseLong(st.nextToken()); // 토너먼트 직행 팀 수
			sb.append(G + "*" + A + "/" + T + "+" + D + "="); // 출력 형식 맞추기
			long qualify = G * A + D; // 조별 리그에서 토너먼트로 진출한 팀의 수
			long tournament = (long) Math.pow(2, (int) Math.ceil(Math.log10(qualify) / Math.log10(2))); // 토너먼트를 진행하는 팀
																										// 수
			long additionCnt = tournament - qualify; // 토너먼트에 추가되는 팀 수
			long gameCnt = (T * (T - 1) / 2 * G) + (tournament - 1); // 총 게임 수
			sb.append(gameCnt + "+" + additionCnt + "\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
