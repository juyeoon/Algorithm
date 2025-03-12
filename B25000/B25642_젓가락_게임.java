import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25642
// while문으로 시뮬레이션 구현 후 
// while문이 끝났을 때의 상태에 맞춰 이긴 사람 출력
public class B25642_젓가락_게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); // 용태가 한 손에 펴고 시작할 손가락의 개수
		int B = Integer.parseInt(st.nextToken()); // 유진이가 한 손에 펴고 시작할 손가락의 개수
		boolean yt = true; // 공격 차례 (true: 용태 공격, false: 유진 공격)
		while (A < 5 && B < 5) { // 다섯 손가락 이상 펴야하는 사람이 있으면 종료
			if (yt) { // 용태 공격
				B += A;
			} else { // 유진 공격
				A += B;
			}
			yt = !yt; // 차례 변경
		}
		System.out.println(yt ? "yj" : "yt"); // 출력
		br.close();
	}
}
