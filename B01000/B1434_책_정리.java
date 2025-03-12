import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 박스들의 용량과 책들의 무게를 각각 배열에 저장한 후
// i) 박스에 넣을 수 있을 때, 박스 용량을 책 크기만큼 삭제하고 다음 책으로
// ii) 박스에 넣을 수 없을 때, 박스의 남은 용량이 낭비되는 용량에 추가하고 다음 박스로
public class B1434_책_정리 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 박스 개수
		int M = Integer.parseInt(st.nextToken()); // 책 개수
		int A[] = new int[N]; // 박스 용량
		int B[] = new int[M]; // 책 크기
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { // A[] 채우기
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) { // B[] 채우기
			B[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0; // 낭비되는 용량의 합
		int i = 0; // A의 인덱스
		int j = 0; // B의 인덱스
		while (i < N && j < M) { // 인덱스 가능 범위까지
			if (A[i] >= B[j]) { // 박스에 넣을 수 있을 때
				A[i] -= B[j]; // 박스 용량을 책 크기만큼 삭제
				j++; // 다음 책으로
			} else { // 박스에 넣을 수 없을 때
				sum += A[i]; // 남은 용량이 낭비되는 용량
				i++; // 다음 박스로
			}
		}
		while (i < N) { // 박스가 뒤에 남았을 떄 남은 용량들은 정부 낭비
			sum += A[i];
			i++;
		}
		System.out.println(sum); // 출력
		br.close();
	}
}