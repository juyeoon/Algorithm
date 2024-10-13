import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 현재 복종하고 있는 마법사가 대결에서 질 때 이긴 마법사에게 복종하게 되면 
// 마지막에 복종하고 있는 마법사가 누구인지, 총 몇 명의 마법사에게 복종했는지 출력하는 문제
// 현재 복종하고 있는 마법사를 저장하는 변수와 마법사 복종 여부 체크를 하는 boolean 배열을 사용하여
// 현재 마법사가 패배했으면 복종 마법사를 승리 마법사로 변경하고 현재 마법사 복종 체크
// 현재 복종 마법사와 boolean 배열의 true 값 개수를 출력
public class B17042_Elder {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char z = br.readLine().charAt(0); // 현재 복종하고 있는 마법사
		boolean w[] = new boolean[26]; // 마법사별 복종 유무
		w[z - 'A'] = true; // 현재 마법사 복종 체크
		int N = Integer.parseInt(br.readLine()); // 대결 횟수
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char z1 = st.nextToken().charAt(0); // 승리 마법사
			char z2 = st.nextToken().charAt(0); // 패배 마법사
			if (z == z2) { // 현재 마법사가 패배했으면
				z = z1; // 복종 마법사를 승리 마법사로 변경
				w[z - 'A'] = true; // 현재 마법사 복종 체크
			}
		}
		int cnt = 0; // 복종한 마법사 수
		for (boolean b : w) { // cnt 세기
			if (b) {
				cnt++;
			}
		}
		System.out.println(z + "\n" + cnt); // 출력
		br.close();
	}
}
