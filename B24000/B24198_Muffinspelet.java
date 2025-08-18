import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/24198
// 한 명이 나누고 한 명이 선택해서 먹는 규칙을 역할을 번갈아 가며 진행
// 먹는 사람은 더 큰 덩어리를 먹음
// 머핀 개수가 0이 될 때까지 규칙에 따른 시뮬레이션 구현 후 각각 먹은 양을 출력
public class B24198_Muffinspelet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 머핀 개수
        long alf = 0; // Alf가 먹은 양 
        long beata = 0; // Beata가 먹은 양
        boolean beataTurn = true; // 먹는 사람이 누군지 표시 (true: Beata가 먹음)
        while (N > 0) {
            int eat = (N + 1) / 2; // 이번에 먹는 양
            if (beataTurn) { // 먹는 사람이 Beata면
                beata += eat;
            } else {
                alf += eat;
            }
            beataTurn = !beataTurn; // 역할 바꾸기
             N = N / 2; // 이번에 먹은 양 빼기
        }
        System.out.println(alf + " " + beata); // 출력
		br.close();
	}
}
