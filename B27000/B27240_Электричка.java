import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/27240
// 도시에서 운영되는 전철 노선의 요금 체계를 판별하는 문제
// 총 n개의 역이 있으며, 역은 1번부터 n번까지 번호가 매겨짐
// 1번부터 a번까지 또는 b번부터 n번까지 "Outside"
// a+1번부터 b-1번까지는 "City"
// 겹쳐 있으면 "Full"
public class B27240_Электричка {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 역 개수
		int a = Integer.parseInt(st.nextToken()); // outside 경계
		int b = Integer.parseInt(st.nextToken()); // outside 경계
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()); // 출발역
		int t = Integer.parseInt(st.nextToken()); // 도착역
		if (s >= a + 1 && s <= b - 1 && t >= a + 1 && t <= b - 1) { // City 내에 위치
			System.out.println("City");
		} else if ((s >= 1 && s <= a && t >= 1 && t <= a) || (s >= b && s <= n && t >= b && t <= n)) { // Outside 내에 위치
			System.out.println("Outside");
		} else { // 그 외의 경우
			System.out.println("Full");
		}
		br.close();
	}
}
