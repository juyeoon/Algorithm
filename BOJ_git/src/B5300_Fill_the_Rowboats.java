import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 번호 하나를 출력할 때 해적 수 + 1. 해적 수가 6명이 되면 Go! 출력, 해적 수 갱신
public class B5300_Fill_the_Rowboats {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 해적의 수
		int cnt = 0; // 한 배에 들어간 해적의 수. 6명 단위로 끊기 위해 사용
		for (int i = 1; i <= N; i++) { // 해적 번호
			cnt++;
			sb.append(i).append(" "); // 번호 추가
			if (cnt == 6) { // 6명이 채워지면
				cnt = 0; // 값 리셋
				sb.append("Go! ");
			}
		}
		if (cnt != 0) { // 마지막이 Go!가 아니면
			sb.append("Go! "); // Go! 추가
		}
		System.out.println(sb); // 출력
		br.close();
	}
}