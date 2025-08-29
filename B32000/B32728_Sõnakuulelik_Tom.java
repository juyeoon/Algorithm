import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32728
// 색상(s,r,p)을 A,B,C 상자에 매핑하여 해당 상자가 꽉 차면 A→B→C→A 순으로 다음 상자 탐색 (나머지 연산 사용)
// int 배열로 각 상자의 장난감 개수 관리, StringBuilder로 각각의 상자 상태를 저장 후 출력
public class B32728_Sõnakuulelik_Tom {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 장난감 개수
		int K = Integer.parseInt(st.nextToken()); // 각 상자의 수용량
		StringBuilder blueBoxA = new StringBuilder(); // 파란색 상자 A
		StringBuilder greenBoxB = new StringBuilder(); // 초록색 상자 B
		StringBuilder redBoxC = new StringBuilder(); // 빨간색 상자 C
		int[] boxCnt = new int[3]; // 현재 박스의 장난감 개수
		String s = br.readLine(); // 장난감 넣는 순서
		for (int i = 0; i < N; i++) {
			char color = s.charAt(i); // 현재 넣을 장난감 색상
			int startIdx = -1; // 확인할 상자 (index)
			int inputBox = -1; // 장난감을 넣을 상자 (index)
			// 확인 시작할 상자 인덱스 찾기
			if (color == 's') {
				startIdx = 0;
			} else if (color == 'r') {
				startIdx = 1;
			} else {
				startIdx = 2;
			}
			// 넣을 상자 인덱스 찾기
			while (true) {
				if (boxCnt[startIdx] < K) { // 현재 확인할 상자에 넣을 수 있으면
					inputBox = startIdx; // 장난감을 넣을 상자 설정
					boxCnt[startIdx]++; // 상자의 장난감 개수 추가
					break;
				} else { // 넣을 수 없으면
					startIdx = (startIdx + 1) % 3; // 다음 상자로
				}
			}
			// 장난감 넣기
			if (inputBox == 0) {
				blueBoxA.append(color);
			} else if (inputBox == 1) {
				greenBoxB.append(color);
			} else {
				redBoxC.append(color);
			}
		}
		// 출력
		System.out.println(blueBoxA);
		System.out.println(greenBoxB);
		System.out.println(redBoxC);
		br.close();
	}
}
