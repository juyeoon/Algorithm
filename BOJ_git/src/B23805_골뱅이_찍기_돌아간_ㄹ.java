import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/23805
// 패턴을 분석한 후 반복문을 사용해서 출력
// 첫번째 줄 : ('@'N*3개 ' 'N개 '@'N개 )N개
// 가운데 줄 : ('@'N개 ' 'N개 '@'N개 ' 'N개 '@'N개 )N*3개
// 마지막 줄 : ('@'N개 ' 'N개 '@'N*3개 )N개
public class B23805_골뱅이_찍기_돌아간_ㄹ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 셀의 크기
		StringBuilder sbtmp = new StringBuilder(); // 임시 StringBuilder
		String first = ""; // 첫번째 줄 모양
		String mid = ""; // 중간 줄 모양
		String last = ""; // 마지막 줄 모양
		// 첫번째 줄 만들기
		for (int j = 0; j < N * 3; j++) {
			sbtmp.append("@");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append(" ");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append("@");
		}
		first = sbtmp.toString();
		// 중간 줄 만들기
		sbtmp.setLength(0);
		for (int j = 0; j < N; j++) {
			sbtmp.append("@");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append(" ");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append("@");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append(" ");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append("@");
		}
		mid = sbtmp.toString();
		// 마지막 줄 만들기
		sbtmp.setLength(0);
		for (int j = 0; j < N; j++) {
			sbtmp.append("@");
		}
		for (int j = 0; j < N; j++) {
			sbtmp.append(" ");
		}
		for (int j = 0; j < N * 3; j++) {
			sbtmp.append("@");
		}
		last = sbtmp.toString();
		// 최종 모양 만들기
		for (int i = 0; i < N; i++) {
			sb.append(first).append("\n");
		}
		for (int i = 0; i < N * 3; i++) {
			sb.append(mid).append("\n");
		}
		for (int i = 0; i < N; i++) {
			sb.append(last).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
