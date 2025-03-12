import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 개의 다른 차원에서 방문 가능한 최대 행성의 수를 찾기
// 연속적으로 같은 차원의 행성 방문할 수 없음 => 두 차원 간 교대로 행성을 방문해야 함
// => (더 작은 차원에서의 모든 행성 수 + 더 큰 차원에서의 추가 행성 수를 합한 값)과
// (더 작은 차원의 모든 행성수의 두 배 값에 1을 더한 값) 중 더 작은 값을 출력
public class B28519_Планеты_двух_измерений {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]); // X 차원의 행성 수
		int m = Integer.parseInt(s[1]); // Y 차원의 행성 수
		if (n > m) { // X가 더 큰 차원일 때
			System.out.println(Math.min(n + m, m * 2 + 1));
		} else { // 그 외
			System.out.println(Math.min(n + m, n * 2 + 1));
		}
		br.close();
	}
}