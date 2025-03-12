import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// NC5를 구하는 문제
// NC5 = (N*(N-1)*(N-2)*(N-3)*(N-4)) / (5*4*3*2*1)
public class B30821_별자리가_될_수_있다면 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 꼭짓점 개수
		int cnt = 5; // 선택할 꼭짓점의 개수
		long tmp1 = 1; // 분자
		long tmp2 = 1; // 분모
		while (cnt > 0) { // 선택 꼭짓점만큼 반복
			tmp1 *= N--; // 분자 구하기
			tmp2 *= cnt--; // 분모 구하기
		}
		System.out.println(tmp1 / tmp2); // 출력
		br.close();
	}
}