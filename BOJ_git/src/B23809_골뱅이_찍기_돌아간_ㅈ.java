import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/23809
// 주어진 규칙에 따라 5개의 구간으로 나누어 출력
// 각 구간은 N번씩 반복
public class B23809_골뱅이_찍기_돌아간_ㅈ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 정수 N

		StringBuilder sb1 = new StringBuilder(); // 첫 번째, 다섯 번째 줄을 위한 sb1
		for (int i = 0; i < N; i++) { // 첫 번째 줄: @ N개를 이어 붙임
			sb1.append('@');
		}
		for (int i = N * 3; i > 0; i--) { // 첫 번째 줄에서 @ 이후에 공백 N*3개를 이어 붙임
			sb1.append(' ');
		}
		for (int i = 0; i < N; i++) { // 첫 번째 줄 끝에 @ N개를 다시 붙임
			sb1.append('@');
		}

		StringBuilder sb2 = new StringBuilder(); // 두 번째 줄을 위한 sb2
		for (int i = 0; i < N; i++) { // 두 번째 줄: @ N개를 이어 붙임
			sb2.append('@');
		}
		for (int i = N * 2; i > 0; i--) { // 두 번째 줄에서 @ 이후에 공백 N*2개를 이어 붙임
			sb2.append(' ');
		}
		for (int i = 0; i < N; i++) { // 두 번째 줄 끝에 @ N개를 다시 붙임
			sb2.append('@');
		}

		StringBuilder sb3 = new StringBuilder(); // 세 번째 줄을 위한 sb3
		for (int i = N * 3; i > 0; i--) { // 세 번째 줄: @ N*3개를 이어 붙임
			sb3.append('@');
		}

		StringBuilder sb = new StringBuilder(); // 출력할 전체 문자열을 담을 sb
		for (int i = 0; i < N; i++) { // 첫 번째 줄을 N번 출력
			sb.append(sb1.toString()).append("\n");
		}
		for (int i = 0; i < N; i++) { // 두 번째 줄을 N번 출력
			sb.append(sb2.toString()).append("\n");
		}
		for (int i = 0; i < N; i++) { // 세 번째 줄을 N번 출력
			sb.append(sb3.toString()).append("\n");
		}
		for (int i = 0; i < N; i++) { // 두 번째 줄을 N번 다시 출력
			sb.append(sb2.toString()).append("\n");
		}
		for (int i = 0; i < N; i++) { // 첫 번째 줄을 N번 다시 출력
			sb.append(sb1.toString()).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
