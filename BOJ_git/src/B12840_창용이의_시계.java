import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/12840
// 현재 시간을 '초 단위'로 변환하여 저장
// T에 따라 쿼리를 하나씩 처리
public class B12840_창용이의_시계 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken()); // 현재 시각 (시)
		int m = Integer.parseInt(st.nextToken()); // 현재 시각 (분)
		int s = Integer.parseInt(st.nextToken()); // 현재 시각 (초)
		int total = h * 3600 + m * 60 + s; // 초 단위 변환
		int q = Integer.parseInt(br.readLine()); // 쿼리 개수 입력 받기
		while (q > 0) { // 쿼리 처리
			st = new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken());
			if (T == 1) { // 앞으로 c초 이동
				int c = Integer.parseInt(st.nextToken());
				total = (total + c) % 86400; // 24시간 유지
			} else if (T == 2) { // 뒤로 c초 이동
				int c = Integer.parseInt(st.nextToken());
				total = (total - c) % 86400;
				if (total < 0)
					total += 86400; // 음수 보정
			} else if (T == 3) { // 현재 시간 출력
				int newH = total / 3600;
				int newM = (total % 3600) / 60;
				int newS = total % 60;
				sb.append(newH).append(" ").append(newM).append(" ").append(newS).append("\n");
			}
			q--;
		}
		System.out.print(sb); // 출력
	}
}
