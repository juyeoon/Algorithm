import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34297
// 주차 공간을 찾기 전에 정확히 C번 주차장을 돌고, 한 바퀴 도는 데 걸리는 시간이 M분이라고 할 때, 
// 주차 공간을 찾기까지 총 얼마나 걸리는 지 찾는 문제
public class B34297_Parking_Pandemonium {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()); // 한 바퀴 도는 데 걸리는 시간
		br.readLine(); // 주차장의 온도(필요 없음)
		int C = Integer.parseInt(br.readLine()); // 주차 공간을 찾기 전까지 주차장을 도는 횟수
		System.out.println(M * C); // 주차 공간을 찾는 데 걸린 총 시간
		br.close();
	}
}
