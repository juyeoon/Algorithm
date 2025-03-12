import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 세 수를 배열에 저장한 뒤 Arrays.sort()를 사용하여 오름차순으로 정렬 후 인덱스가 1인 값을 출력
public class B6840_Who_is_in_the_middle물음표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n[] = new int[3]; // 입력 받은 세 수
		for (int i = 0; i < 3; i++) { // input n[]
			n[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(n); // 오름차순 정렬
		System.out.println(n[1]); // 두 번째(인덱스가 1) 값 출력
		br.close();
	}
}