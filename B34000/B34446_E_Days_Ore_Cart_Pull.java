import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34446
// 광석 수레가 퍼레이드 시작 지점에서 출발하여 국회의사당에 도착 후 다시 시작 지점으로 돌아왔을 때
// 수레가 이동한 총 거리를 출력하는 문제
public class B34446_E_Days_Ore_Cart_Pull {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine()); // 퍼레이드 시작 지점에서 국회의사당까지의 거리
		int n = Integer.parseInt(br.readLine()); // 퍼레이드에 참여한 학생 수
		int t = Integer.parseInt(br.readLine()); // 광석 수레가 도착했을 당시 국회의사당의 화씨 기온
		System.out.println(m * 2);
		br.close();
	}
}
