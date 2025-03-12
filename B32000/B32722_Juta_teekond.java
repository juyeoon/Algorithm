import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32722
// 갈림길의 번호가 있고 번호가 주어졌을 때 주어진 번호가 갈림길을 갔을 때 나올 수 있는 번호인지 출력하는 문제
// 이차원 배열에 갈림길 번호를 저장한 후 각 갈림길에 해당하는 번호인지 확인하고 하나라도 아니면 EI 출력
public class B32722_Juta_teekond {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[][] = { { 1, 6, 2 }, { 3, 8, 5 } }; // 갈림길 번호
		boolean yes = true; // 갈림길을 다 지날 수 있으면 true
		for (int i = 0; i < 3; i++) { // 3개의 갈림길
			int n = Integer.parseInt(br.readLine());
			if (n != num[0][i] && n != num[1][i]) { // 두 길의 번호 모두 아니면
				yes = false; // 갈림길을 간 것이 아님
				break;
			}
		}
		System.out.println(yes ? "JAH" : "EI"); // 출력
		br.close();
	}
}
