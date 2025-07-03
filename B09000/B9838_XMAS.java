import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/9838
// n+1 크기의 배열을 생성하여
// 인덱스: 선물 가져온 손님 번호, 값: 선물을 받아간 손님 번호를 저장한 후
// 배열을 순서대로 출력
public class B9838_XMAS {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 손님의 수
		int[] list = new int[n + 1]; // 선물을 받아간 손님의 번호 (인덱스: 선물 가져온 손님 번호, 값: 선물을 받아간 손님 번호)
		for (int i = 1; i <= n; i++) { // list[] 채우기
			list[Integer.parseInt(br.readLine())] = i;
		}
		for (int i = 1; i <= n; i++) { // 출력 저장
			sb.append(list[i]).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
