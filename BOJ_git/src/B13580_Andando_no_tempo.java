import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 두 번 또는 세 번 시간 여행을 하여 현재로 돌아올 수 있는지 확인하는 문제
// 같은 숫자 2개가 있으면 가능
// 가장 큰 수를 다른 두 수를 더했을 때 만들 수 있으면 가능
// 그 외의 경우는 불가능
public class B13580_Andando_no_tempo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int num[] = new int[3]; // 입력 수
		for (int i = 0; i < 3; i++) { // int형으로 바꾸기
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num); // 오름차순으로 정렬
		boolean isPossible = false; // 가능 여부를 저장(true: 현재로 돌아올 수 있음)
		if (num[0] == num[1] || num[1] == num[2]) { // 같은 수가 2개 있음
			isPossible = true;
		} else if (num[0] + num[1] == num[2]) { // 작은 두 수를 더하면 가장 큰 수와 같음
			isPossible = true;
		}
		System.out.println(isPossible ? 'S' : 'N'); // 출력
		br.close();
	}
}