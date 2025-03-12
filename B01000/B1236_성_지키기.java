import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 경비원 한 명이 한 열과 한 행을 동시에 보호할 수 있기 때문에 경비원이 없는 행의 개수와 경비원이 없는 열의 개수 중 최댓값이 최소 경비원 수
// 행과 열의 경비원의 유무는 행 유무 배열과 열 유무 배열(boolean)을 사용하여 확인
public class B1236_성_지키기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1[] = br.readLine().split(" ");
		int N = Integer.parseInt(s1[0]); // 행 개수
		int M = Integer.parseInt(s1[1]); // 열 개수
		boolean r[] = new boolean[N]; // 행의 경비원 유무
		boolean c[] = new boolean[M]; // 열의 경비원 유무
		for (int i = 0; i < N; i++) { // r[]와 c[] 채우기
			String s2 = br.readLine();
			for (int j = 0; j < M; j++) {
				char tmp = s2.charAt(j);
				if (tmp == 'X') {
					r[i] = true;
					c[j] = true;
				}
			}
		}
		int Rcnt = 0; // 경비원이 없는 행의 개수
		int Ccnt = 0; // 경비원이 없는 열의 개수
		for (boolean b : r) { // Rcnt 구하기
			if (!b) {
				Rcnt++;
			}
		}
		for (boolean b : c) { // Ccnt 구하기
			if (!b) {
				Ccnt++;
			}
		}
		System.out.println(Math.max(Rcnt, Ccnt)); // 출력
		br.close();
	}
}