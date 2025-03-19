import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33612
// 2024년 8월에서 N(입력값-1)번 후의 날짜를 계산
// 연도: (추가 달) / (1년) + (기준연도) = (N * 7) / 12 + 2024
// 달: (추가 달) % (1년) + (기준달) = (N * 7) % 12 + 8
// 달 계산 후에 12가 넘으면 연도에 1을 추가하고 달에서 12를 뺌
public class B33612_피갤컵 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1; // N번 후의 날짜
		int year = N * 7 / 12 + 2024; // 계산 연도
		int month = N * 7 % 12 + 8; // 계산 달
		if (month > 12) { // 달 추가 계산
			year++;
			month -= 12;
		}
		System.out.println(year + " " + month); // 출력
		br.close();
	}
}
