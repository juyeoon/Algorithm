import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 방의 가로 길이, 세로 길이, 높이가 주어질 때, 이 방이 좋은 방인지 판별하는 문제
// 1) 가로와 세로 중 더 짧은 쪽의 길이와 높이의 비가 2 이상
// 2) 가로와 세로 중 더 긴 쪽의 길이와 짧은 쪽의 길이의 비가 2 이하
// 위의 두 조건을 모두 만족하면 "good" 출력, 아니면 "bad" 출력
public class B27245_Комната {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(br.readLine()); // 가로
		int l = Integer.parseInt(br.readLine()); // 세로
		int h = Integer.parseInt(br.readLine()); // 높이
		boolean goodRoom = true; // 조건 만족 여부(true: 둘 다 만족)
		if (Math.min(w, l) / h < 2) { // 가로와 세로 중 더 짧은 쪽의 길이와 높이의 비가 2 미만일 때
			goodRoom = false; // 조건 불충족
		}
		if (Math.max(w, l) / Math.min(w, l) > 2) { // 가로와 세로 중 더 긴 쪽의 길이와 짧은 쪽의 길이의 비가 2 초과일 때
			goodRoom = false; // 조건 불충족
		}
		System.out.println(goodRoom ? "good" : "bad"); // 출력
		br.close();
	}
}