import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 합이 100이 넘을 때까지 합한 후 그 이전 값까지 합한 값과 비교한 후 100과의 차이가 작은 쪽을 출력
public class B2851_슈퍼_마리오 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mushroom[] = new int[10]; // 버섯 점수 10개
		int sum = 0; // 합
		int idx = 0; // 버섯 점수 인덱스
		while (idx < 10) {
			mushroom[idx] = Integer.parseInt(br.readLine()); // mushroom[] 채우기
			sum += mushroom[idx]; // 현재 값을 합에 더하기
			if (sum >= 100) { // 합이 100이 넘으면
				break; // 반복문 탈출
			}
			idx++;
		}
		int before = sum; // 현재의 하나 이전값까지의 합
		if (idx < 10) { // 위의 반복문이 중간에 탈출했으면
			before -= mushroom[idx]; // 현재 합에서 이전 값 빼기(이전까지의 합)
		}

		if (100 - before < sum - 100) { // 100을 넘긴 합이 더 100에 가까우면
			System.out.println(before); // 100을 안 넘긴 합 출력
		} else { // 그 외
			System.out.println(sum);
		}
		br.close();
	}
}
