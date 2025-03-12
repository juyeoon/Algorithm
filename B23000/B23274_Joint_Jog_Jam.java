import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/23274
// 두 개의 선분을 따라 이동하는 두 점(Kari와 Ola) 사이의 최대 거리를 찾는 문제
// Kari의 위치 = K(t) = (xk1 + t * (xk2 - xk1), yk1 + t * (yk2 - yk1))
// Ola의 위치 = O(t) = (xo1 + t * (xo2 - xo1), yo1 + t * (yo2 - yo1))
// 두 사람 사이의 거리 함수 : D²(t) = A * t² + B * t + C
// 거리 함수 d(t)는 2차 함수이므로, 최대값은 t=0, t=1, 그리고 도함수가 0이 되는 지점 tm에서 발생
// 단 0 <= tm <= 1
public class B23274_Joint_Jog_Jam {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int xk1 = Integer.parseInt(st.nextToken()); // Kari의 시작 x 좌표
		int yk1 = Integer.parseInt(st.nextToken()); // Kari의 시작 y 좌표
		int xo1 = Integer.parseInt(st.nextToken()); // Ola의 시작 x 좌표
		int yo1 = Integer.parseInt(st.nextToken()); // Ola의 시작 y 좌표
		int xk2 = Integer.parseInt(st.nextToken()); // Kari의 끝 x 좌표
		int yk2 = Integer.parseInt(st.nextToken()); // Kari의 끝 y 좌표
		int xo2 = Integer.parseInt(st.nextToken()); // Ola의 끝 x 좌표
		int yo2 = Integer.parseInt(st.nextToken()); // Ola의 끝 y 좌표
		// Kari와 Ola의 이동 거리 계산
		int dxk = xk2 - xk1;
		int dyk = yk2 - yk1;
		int dxo = xo2 - xo1;
		int dyo = yo2 - yo1;
		// 두 사람 사이의 거리 제곱을 구하는 이차 방정식 계수 계산
		double A = Math.pow(dxk - dxo, 2) + Math.pow(dyk - dyo, 2);
		double B = 2 * ((xk1 - xo1) * (dxk - dxo) + (yk1 - yo1) * (dyk - dyo));
		double C = Math.pow(xk1 - xo1, 2) + Math.pow(yk1 - yo1, 2);
		// t = 0과 t = 1에서의 거리 제곱값 계산
		double d0 = C;
		double d1 = A + B + C;
		double maxD; // 최대 거리 값
		if (A != 0) { // A가 0이 아닐 경우, 0 <= t <= 1 범위에서 최대 거리 계산
			double tm = -B / (2 * A); // 도함수가 0이 되는 지점 계산
			if (0 <= tm && tm <= 1) { // t 범위 내에 있는지 확인
				double dMid = A * tm * tm + B * tm + C; // 해당 지점에서의 거리 제곱값 계산
				maxD = Math.max(d0, Math.max(d1, dMid));
			} else {
				maxD = Math.max(d0, d1);
			}
		} else {
			maxD = Math.max(d0, d1);
		}
		System.out.printf("%.10f\n", Math.sqrt(maxD)); // 출력
		br.close();
	}
}
