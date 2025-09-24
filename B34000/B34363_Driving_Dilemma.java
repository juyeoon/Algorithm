import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34363
// (mile/hour)과 (feet)와 (sec)가 주어졌을 때 단위를 맞춰서 비교하는 것이 핵심
public class B34363_Driving_Dilemma {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double S = Double.parseDouble(br.readLine()); // 리시가 운전하고 있는 도로의 제한 속도 (mile/hour)
		double D = Double.parseDouble(br.readLine()); // 교차로 끝까지의 거리(feet)
		double T = Double.parseDouble(br.readLine()); // 신호등이 빨간색으로 바뀌기 전의 시간 (sec)
		double Sfs = S * 1.46667; // 리시가 운전하고 있는 도로의 제한 속도 (feet/sec)
		if (D <= Sfs * T) { // 남은 거리가 이론상 달리는 거리보다 작거나 같으면 가능
			System.out.println("MADE IT");
		} else {
			System.out.println("FAILED TEST");
		}
		br.close();
	}
}
