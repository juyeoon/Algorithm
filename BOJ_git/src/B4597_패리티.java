import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 원본 값의 1의 개수를 저장한 후 
// 짝수 패러티인데 1의 개수가 짝수거나
// 홀수 패러티인데 1의 개수가 홀수면 1이 더이상 필요 없음 => 0
// 그 외는 1 추가하여 출력
public class B4597_패리티 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("#")) { // EOI
			char c[] = s.toCharArray(); // 숫자 하나씩 끊기
			int lastIdx = c.length - 1; // 반복문 종료 조건
			int oneCnt = 0; // 1의 개수
			for (int i = 0; i < lastIdx; i++) {
				sb.append(c[i]); // 원본 값 출력
				if (c[i] == '1') { // 1이면 oneCnt 하나 증가
					oneCnt++;
				}
			}
			// 마지막 문자 추가하기
			// 짝수 패러티인데 1의 개수가 짝수거나
			// 홀수 패러티인데 1의 개수가 홀수거나
			// 면 1이 더이상 필요 없다 => 0 출력
			if ((c[lastIdx] == 'e' && oneCnt % 2 == 0) || c[lastIdx] == 'o' && oneCnt % 2 == 1) {
				sb.append(0);
			} else {
				sb.append(1);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}