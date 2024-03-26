import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 왼쪽과 오른쪽의 에스컬레이터의 조건이 주어졌을 때, 어느 에스컬레이터를 골라야 빠르게 올라갈 수 있는지를 구하는 문제
// 에스컬레이터 이용할 때 걸리는 시간 = (에스컬레이터 계단 수)/(1초에 이동하는 계단 수) + (앞에 있는 사람으로 인해 기다려야 하는 시간)
public class B20867_Rulltrappa {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double M = Double.parseDouble(st.nextToken()); // 에스컬레이터의 계단 수
		int S = Integer.parseInt(st.nextToken()); // 에스컬레이터에 가만히 있을 때 1초에 올라가는 계단 수(오른쪽)
		int G = Integer.parseInt(st.nextToken()); // 에스컬레이터를 걸어 올라갈 때 1초에 올라가는 계단 수(왼쪽)
		st = new StringTokenizer(br.readLine());
		double A = Double.parseDouble(st.nextToken()); // 왼쪽 에스컬레이터를 이용할 때 앞에 있는 사람 한 명 당 기다려야 하는 시간(초)
		double B = Double.parseDouble(st.nextToken()); // 오른쪽 에스컬레이터를 이용할 때 앞에 있는 사람 한 명 당 기다려야 하는 시간(초)
		st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken()); // 왼쪽 에스컬레이터에 기다려야 하는 사람 수
		int R = Integer.parseInt(st.nextToken()); // 오른쪽 에스컬레이터에 기다려야 하는 사람 수
		double left = M / G + L / A; // 왼쪽 에스컬레이터를 이용할 때 걸리는 시간
		double right = M / S + R / B; // 오른쪽 에스컬레이터를 이용할 때 걸리는 시간
		System.out.println(left > right ? "latmask" : "friskus"); // 출력
		br.close();
	}
}