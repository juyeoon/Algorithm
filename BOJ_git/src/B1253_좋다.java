import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 투 포인터 알고리즘 사용
// 입력값을 배열에 넣은 후 오름차순 정렬
// 배열의 첫 번째 값을 가리키는 start와 마지막 값을 가리키는 end와 ‘좋은 수’인지 확인할 수를 가리키는 target
// target은 0에서 N-1까지 반복하여 ‘좋은 수’인지 확인
// 투 포인터로 start와 end를 이동시키며(start < end 조건을 만족할 때만) 두 값의 합이 target과 같은지 확인 후 같으면 카운트
// 확인할 때 추가 조건 => start와 end는 target과 같을 수 없음
public class B1253_좋다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력 값 개수
		String s[] = br.readLine().split(" ");
		long num[] = new long[N]; // 입력 값 저장 배열
		for (int i = 0; i < N; i++) { // num[] 입력
			num[i] = Long.parseLong(s[i]);
		}
		Arrays.sort(num); // 오름차순 정렬
		int start = 0; // 포인터 1
		int end = N - 1; // 포인터 2
		int cnt = 0; // 좋은 수 개수
		for (int target = 0; target < N; target++) { // target 설정
			while (start < end) { // 투 포인터 이동
				long sum = num[start] + num[end]; // 두 값의 합
				if (sum < num[target]) { // 두 값의 합이 더 작으면 값 증가(start++)
					start++;
				} else if (sum > num[target]) { // 두 값의 합이 더 크면 값 증가(end--)
					end--;
				} else { // 두 값의 합과 target이 같으면
					if (start != target && end != target) { // start, end 모두 target이 아니면
						cnt++; // 카운트
						break; // 다음 target으로
					} else if (start == target) { // start가 target이면
						start++;
					} else if (end == target) { // end가 target이면
						end--;
					}
				}
			}
			start = 0; // start 초기화
			end = N - 1; // end 초기화
		}
		System.out.println(cnt); // 개수 출력
		br.close();
	}
}