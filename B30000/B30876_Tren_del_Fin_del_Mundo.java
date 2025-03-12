import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// y값이 가장 작은(= 가장 남쪽에 있는) 좌표를 찾는 문제
// y의 최솟값을 저장해두고 현재 y가 최솟값보다 작으면 y 최솟값 갱신. 그 때의 x값도 저장
public class B30876_Tren_del_Fin_del_Mundo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 좌표 개수
		int minY = Integer.MAX_VALUE; // y좌표 최솟값
		int minX = 0; // y 최솟값의 x좌표
		for (int i = 0; i < N; i++) { // 최솟값 구하기
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken()); // 현재의 x 좌표
			int y = Integer.parseInt(st.nextToken()); // 현재의 y 좌표
			if (minY > y) { // 최솟값보다 작으면 갱신
				minY = y;
				minX = x;
			}
		}
		System.out.println(minX + " " + minY); // 출력
		br.close();
	}
}