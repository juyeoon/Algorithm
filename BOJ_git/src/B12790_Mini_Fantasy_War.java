import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 단순 계산, 조건에 맞게 최솟값 정하기
public class B12790_Mini_Fantasy_War {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int num[] = new int[8]; // 기본 HP, MP, 공격력, 방어력와 증감 수치
			for (int i = 0; i < 8; i++) { // input num[]
				num[i] = Integer.parseInt(st.nextToken());
			}
			int value[] = new int[4]; // 장비에 의한 HP, MP, 공격력, 방어력
			for (int i = 0; i < 4; i++) { // 장비에 의한 HP, MP, 공격력, 방어력 계산
				value[i] = num[i] + num[i + 4];
			}
			// HP, MP, 공격력 최솟값 설정
			if (value[0] < 1)
				value[0] = 1;
			if (value[1] < 1)
				value[1] = 1;
			if (value[2] < 0)
				value[2] = 0;
			sb.append(value[0] + value[1] * 5 + value[2] * 2 + value[3] * 2).append("\n"); // 전투력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}